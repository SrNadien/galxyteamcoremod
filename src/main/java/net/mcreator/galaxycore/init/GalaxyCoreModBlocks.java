
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.galaxycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.galaxycore.block.SexyXDBlock;
import net.mcreator.galaxycore.block.PruebaaBlock;
import net.mcreator.galaxycore.block.BloqueBlock;
import net.mcreator.galaxycore.GalaxyCoreMod;

public class GalaxyCoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GalaxyCoreMod.MODID);
	public static final RegistryObject<Block> SEXY_XD = REGISTRY.register("sexy_xd", () -> new SexyXDBlock());
	public static final RegistryObject<Block> PRUEBAA = REGISTRY.register("pruebaa", () -> new PruebaaBlock());
	public static final RegistryObject<Block> BLOQUE = REGISTRY.register("bloque", () -> new BloqueBlock());
}
