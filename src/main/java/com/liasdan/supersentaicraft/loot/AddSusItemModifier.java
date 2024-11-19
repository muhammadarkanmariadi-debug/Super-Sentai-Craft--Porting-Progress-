package com.liasdan.supersentaicraft.loot;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.NotNull;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class AddSusItemModifier extends LootModifier {
	
	public static final Supplier<MapCodec<AddSusItemModifier>> CODEC = Suppliers.memoize(()
			-> RecordCodecBuilder.mapCodec(addSusItemModifierInstance -> AddSusItemModifier.codecStart(addSusItemModifierInstance).and(BuiltInRegistries.ITEM.byNameCodec()
					.fieldOf("item").forGetter(m -> m.item)).apply(addSusItemModifierInstance, AddSusItemModifier::new)));
	private final Item item;

	protected AddSusItemModifier(LootItemCondition[] conditionsIn, Item item) {
		super(conditionsIn);
		this.item = item;
	}

	@Override
	protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
		for(LootItemCondition condition : this.conditions) {
			if(!condition.test(context)) {
				return generatedLoot;
			}
		}
		
		if(context.getRandom().nextFloat() < 0.5f) {
			generatedLoot.clear();
			generatedLoot.add(new ItemStack(this.item));
		}
		
		return generatedLoot;
	}

	@Override
	public MapCodec<? extends IGlobalLootModifier> codec() {
		return CODEC.get();
	}
}