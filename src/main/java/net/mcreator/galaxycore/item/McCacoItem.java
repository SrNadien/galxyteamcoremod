
package net.mcreator.galaxycore.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class McCacoItem extends RecordItem {
	public McCacoItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("galaxy_core:feliz")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 2000);
	}
}
