package com.liasdan.supersentaicraft.entity.mecha;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;

public class BaseMechaEntity extends Mob implements GeoEntity {
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	
	public String NAME = "mecha";
	public String NAME_MODEL = "mecha";
	public String NAME_ANIMATIONS = "mecha";
	
	public float MAX_SPEED = 0.05f;
	public boolean CAN_FLY = false;
	
	public RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.model.idle");
	public RawAnimation DRIVE = RawAnimation.begin().thenLoop("animation.model.walk");
	
	public Item VEHICLE_DROP;

	public BaseMechaEntity(EntityType<? extends Mob> entityType, Level level, Item drop, boolean canFly) {
		super(entityType, level);
		this.setPersistenceRequired();
		this.VEHICLE_DROP = drop;
		this.CAN_FLY = canFly;
	}

	public static AttributeSupplier.Builder setAttributes() {
		return Mob.createMobAttributes()
				.add(Attributes.MOVEMENT_SPEED, 0.5F)
				.add(Attributes.MAX_HEALTH, 100.0D)
				.add(Attributes.ATTACK_DAMAGE, 10.0D)
                .add(Attributes.ARMOR, 10.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.0D);
	}

	@Override
	public InteractionResult mobInteract(Player player, InteractionHand hand) {
		if (!this.isVehicle() && !player.isShiftKeyDown()) {
			if (!this.level().isClientSide()) {
				player.startRiding(this);
			}
			return InteractionResult.sidedSuccess(this.level().isClientSide());
		}
		return super.mobInteract(player, hand);
	}

	@Override
	public boolean isPickable() {
		return true;
	}

	@Override
	public float getPickRadius() {
		return 3.0F; // Memperluas area klik (hitbox interaksi) sebesar 3 blok ke segala arah
	}

	@Override
	public boolean canBeCollidedWith() { return true; }
	@Override
	public boolean isPushable() { return true; }

	@Override
	public boolean hurt(DamageSource source, float amount) {
		return super.hurt(source, source.is(DamageTypes.PLAYER_ATTACK) && !this.hasControllingPassenger() ? this.getMaxHealth() : amount);
	}

	@Override
	protected void playStepSound(BlockPos pos, BlockState state) { }

	public int attackCooldown = 0;

	@Override
	public void tick() {
		super.tick();
		if (attackCooldown > 0) {
			attackCooldown--;
		}
	}

	public void performAttack(int type) {
		if (attackCooldown > 0) return;
		attackCooldown = 20; // 1 detik cooldown

		if (type == 0) {
			// Slash / Tebasan Area
			this.triggerAnim("action_controller", "slash");
			
			// AoE Damage
			net.minecraft.world.phys.AABB hitBox = this.getBoundingBox().inflate(6.0).move(this.getLookAngle().scale(6));
			java.util.List<LivingEntity> targets = this.level().getEntitiesOfClass(LivingEntity.class, hitBox, e -> e != this && e != this.getControllingPassenger());
			for (LivingEntity target : targets) {
				target.hurt(this.damageSources().mobAttack(this), 50.0F); // 50 Damage default
			}
		} else if (type == 1) {
			// Shot / Tembakan
			if ("patkaiser".equals(this.NAME)) {
				this.triggerAnim("action_controller", "blast");
			} else {
				this.triggerAnim("action_controller", "shot");
			}
			
			try {
				net.minecraft.world.entity.projectile.ThrowableProjectile projectile = 
					(net.minecraft.world.entity.projectile.ThrowableProjectile) com.liasdan.supersentaicraft.entity.MobsCore.EXPLOSIVE_PROJECTILE.get().create(this.level());
				if (projectile != null) {
					net.minecraft.world.phys.Vec3 look = this.getLookAngle();
					projectile.setPos(this.getX() + look.x * 5, this.getY() + this.getBbHeight() * 0.8, this.getZ() + look.z * 5);
					projectile.shoot(look.x, look.y, look.z, 3.0F, 0.0F);
					this.level().addFreshEntity(projectile);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void travel(Vec3 pos) {
		if (this.isAlive()) {
			float z = 0;
			if (this.isVehicle() && getControllingPassenger() instanceof LivingEntity passenger) {
				this.yRotO = getYRot();
				this.xRotO = getXRot();
				
				z = passenger.zza;
				if (z <= 0) z *= 0.25f; // reverse speed
				
				this.setSpeed((float) this.getAttributeValue(Attributes.MOVEMENT_SPEED));
				
				if (this.CAN_FLY) {
					this.setNoGravity(true);
					if (z > 0) {
						float speedY = -passenger.getXRot() * 0.015f; // fly up/down based on pitch
						Vec3 movement = this.getDeltaMovement();
						this.setDeltaMovement(movement.x, speedY, movement.z);
					} else {
						Vec3 movement = this.getDeltaMovement();
						this.setDeltaMovement(movement.x, movement.y * 0.8, movement.z); // hover damping
					}
				}
				
				setYRot(yRotO - passenger.xxa * 5F);
				setXRot(passenger.getXRot() * 1f);
				setRot(getYRot(), getXRot());
				this.yBodyRot = this.getYRot();
				this.yHeadRot = this.yBodyRot;
			} else {
				if (this.CAN_FLY) {
					this.setNoGravity(false);
				}
			}
			
			super.travel(new Vec3(0, pos.y, z));
		}
	}

	@Nullable
	@Override
	public LivingEntity getControllingPassenger() {
		return getFirstPassenger() instanceof LivingEntity entity ? entity : null;
	}

	@Override
	public boolean isControlledByLocalInstance() { return true; }

	@Override
	public void positionRider(Entity entity, MoveFunction moveFunction) {
		if (entity instanceof LivingEntity passenger) {
			float heightOffset = 1.0f;
			if ("lupinkaiser".equals(this.NAME) || "patkaiser".equals(this.NAME)) {
				heightOffset = 17.0f; // Chest level for giant 24-block tall mecha
			}
			moveFunction.accept(entity, getX(), getY() + heightOffset, getZ());
			this.xRotO = passenger.xRotO;
		}
	}

	@Override
	public void die(DamageSource p_21809_) {
		super.die(p_21809_);
		if (!this.level().isClientSide() && this.VEHICLE_DROP != null) {
            this.spawnAtLocation(this.VEHICLE_DROP);
        }
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() { return this.cache; }

	@Override
	public boolean shouldDropExperience() { return false; }

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, "controller", 2, state -> {
			if (getControllingPassenger() != null && getControllingPassenger().zza != 0) {
				return state.setAndContinue(DRIVE);
			}
			return state.setAndContinue(IDLE);
		}));

		controllers.add(new AnimationController<>(this, "action_controller", 0, state -> software.bernie.geckolib.animation.PlayState.STOP)
			.triggerableAnim("gattai", RawAnimation.begin().thenPlay("animation." + NAME + ".gattai"))
			.triggerableAnim("slash", RawAnimation.begin().thenPlay("animation." + NAME + ".slash"))
			.triggerableAnim("shot", RawAnimation.begin().thenPlay("animation." + NAME + ".shot"))
			.triggerableAnim("blast", RawAnimation.begin().thenPlay("animation." + NAME + "_slash.blast")));
	}
}
