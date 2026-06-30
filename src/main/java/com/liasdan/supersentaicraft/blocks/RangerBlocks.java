package com.liasdan.supersentaicraft.blocks;

import java.util.function.Supplier;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.custom.DaigoyouBlock;
import com.liasdan.supersentaicraft.blocks.custom.LifeBird;
import com.liasdan.supersentaicraft.blocks.machine.BoonboomCarProgrammer;
import com.liasdan.supersentaicraft.blocks.machine.MiniatureEnetronTank;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RangerBlocks {
	
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SuperSentaiCraftCore.MODID);

	public static final DeferredBlock<Block> MECHA_ORE = registerBlock("mecha_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> MECHA_TOPIA_ORE = registerBlock("mecha_topia_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> DEEPSLATE_MECHA_ORE = registerBlock("deepslate_mecha_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> MECHA_NETHER_ORE = registerBlock("mecha_nether_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.NETHERRACK), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> GAORANGER_ORE = registerBlock("gaoranger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> DEEPSLATE_GAORANGER_ORE = registerBlock("deepslate_gaoranger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> SHINKENGER_ORE = registerBlock("shinkenger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> DEEPSLATE_SHINKENGER_ORE = registerBlock("deepslate_shinkenger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> UNREFINED_ENETRON = registerBlock("unrefined_enetron",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> LUPAT_ORE = registerBlock("lupat_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> DEEPSLATE_LUPAT_ORE = registerBlock("deepslate_lupat_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> RYUSOULGER_ORE = registerBlock("ryusoulger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> DEEPSLATE_RYUSOULGER_ORE = registerBlock("deepslate_ryusoulger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> KING_OHGER_ORE = registerBlock("king_ohger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> DEEPSLATE_KING_OHGER_ORE = registerBlock("deepslate_king_ohger_ore",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)
					.strength(2f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)));

	public static final DeferredBlock<Block> LIFE_BIRD = registerBlock("life_bird",
			() -> new LifeBird(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
					.strength(5.0F, 6.0F).dynamicShape().lightLevel((p_152632_) -> {
						return 10;}),Block.box(4, 0, 4, 12,16, 12)).AddToTabList(RangerTabs.BLOCKS));

	public static final DeferredBlock<Block> DAIGOYOU_BLOCK = registerBlock("daigoyou_block",
			() -> new DaigoyouBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
					.strength(5.0F, 6.0F).dynamicShape().lightLevel((p_152632_) -> {
						return 15;}),Block.box(4, 0, 4, 12,16, 12)).AddToTabList(RangerTabs.BLOCKS));

	public static final DeferredBlock<Block> MINIATURE_ENETRON_TANK = registerBlock("miniature_enetron_tank",
			() -> new MiniatureEnetronTank(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
					.strength(5.0F, 6.0F).sound(SoundType.METAL).dynamicShape().lightLevel((p_152632_) -> {
						return 10;}),Block.box(1, 0, 2, 14,16, 14)).AddToTabList(RangerTabs.BLOCKS));

	public static final DeferredBlock<Block> BOONBOOM_CAR_PROGRAMMER = registerBlock("boonboom_car_programmer",
			() -> new BoonboomCarProgrammer(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.IRON_XYLOPHONE)
					.strength(5.0F, 6.0F).sound(SoundType.METAL).dynamicShape().lightLevel((p_152632_) -> {
						return 10;}),Block.box(1, 0, 2, 14,16, 14)).AddToTabList(RangerTabs.BLOCKS));

	
	// Auto-ported Ores from 1.12.2
	public static final DeferredBlock<Block> GORANGER_ORE = registerBlock("goranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_GORANGER_ORE = registerBlock("deepslate_goranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> JAKQ_ORE = registerBlock("jakq_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_JAKQ_ORE = registerBlock("deepslate_jakq_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> BATTLE_FEVER_ORE = registerBlock("battle_fever_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_BATTLE_FEVER_ORE = registerBlock("deepslate_battle_fever_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> DENZIMAN_ORE = registerBlock("denziman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_DENZIMAN_ORE = registerBlock("deepslate_denziman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> SUN_VULCAN_ORE = registerBlock("sun_vulcan_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_SUN_VULCAN_ORE = registerBlock("deepslate_sun_vulcan_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> GOGGLE_V_ORE = registerBlock("goggle_v_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_GOGGLE_V_ORE = registerBlock("deepslate_goggle_v_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> BIOMAN_ORE = registerBlock("bioman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_BIOMAN_ORE = registerBlock("deepslate_bioman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> FLASHMAN_ORE = registerBlock("flashman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_FLASHMAN_ORE = registerBlock("deepslate_flashman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> MASKMAN_ORE = registerBlock("maskman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_MASKMAN_ORE = registerBlock("deepslate_maskman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> TURBORANGER_ORE = registerBlock("turboranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_TURBORANGER_ORE = registerBlock("deepslate_turboranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> JETMAN_ORE = registerBlock("jetman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_JETMAN_ORE = registerBlock("deepslate_jetman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> ZYURANGER_ORE = registerBlock("zyuranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_ZYURANGER_ORE = registerBlock("deepslate_zyuranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> DAIRANGER_ORE = registerBlock("dairanger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_DAIRANGER_ORE = registerBlock("deepslate_dairanger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> CARRANGER_ORE = registerBlock("carranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_CARRANGER_ORE = registerBlock("deepslate_carranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> MEGARANGER_ORE = registerBlock("megaranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_MEGARANGER_ORE = registerBlock("deepslate_megaranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> GINGAMAN_ORE = registerBlock("gingaman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_GINGAMAN_ORE = registerBlock("deepslate_gingaman_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> GOGO_V_ORE = registerBlock("gogo_v_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_GOGO_V_ORE = registerBlock("deepslate_gogo_v_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> ABARANGER_ORE = registerBlock("abaranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_ABARANGER_ORE = registerBlock("deepslate_abaranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> DEKARANGER_ORE = registerBlock("dekaranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_DEKARANGER_ORE = registerBlock("deepslate_dekaranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> DEKARANGER_NETHER_ORE = registerBlock("dekaranger_nether_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> BOUKENGER_ORE = registerBlock("boukenger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_BOUKENGER_ORE = registerBlock("deepslate_boukenger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> GEKIRANGER_ORE = registerBlock("gekiranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_GEKIRANGER_ORE = registerBlock("deepslate_gekiranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> GO_ONGER_ORE = registerBlock("go_onger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_GO_ONGER_ORE = registerBlock("deepslate_go_onger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> GO_BUSTERS_ORE = registerBlock("go_busters_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_GO_BUSTERS_ORE = registerBlock("deepslate_go_busters_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> DOUBUTSU_GO_BUSTERS_ORE = registerBlock("doubutsu_go_busters_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_DOUBUTSU_GO_BUSTERS_ORE = registerBlock("deepslate_doubutsu_go_busters_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> TOQGER_ORE = registerBlock("toqger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_TOQGER_ORE = registerBlock("deepslate_toqger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> ZYUOHGER_ORE = registerBlock("zyuohger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_ZYUOHGER_ORE = registerBlock("deepslate_zyuohger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> KYURANGER_ORE = registerBlock("kyuranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_KYURANGER_ORE = registerBlock("deepslate_kyuranger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> KYURANGER_NETHER_ORE = registerBlock("kyuranger_nether_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> VS_VEHICLE_ORE = registerBlock("vs_vehicle_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_VS_VEHICLE_ORE = registerBlock("deepslate_vs_vehicle_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> KIRAMEIGER_ORE = registerBlock("kirameiger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_KIRAMEIGER_ORE = registerBlock("deepslate_kirameiger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
	public static final DeferredBlock<Block> ZENKAIGER_ORE = registerBlock("zenkaiger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
	public static final DeferredBlock<Block> DEEPSLATE_ZENKAIGER_ORE = registerBlock("deepslate_zenkaiger_ore",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));

	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
		OtherItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}