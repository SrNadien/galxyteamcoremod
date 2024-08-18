
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PanchitoItem extends Item {
	public PanchitoItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(40).saturationMod(40f).build()));
	}
}
