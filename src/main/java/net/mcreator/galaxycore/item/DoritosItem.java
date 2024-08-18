
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class DoritosItem extends Item {
	public DoritosItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(50).saturationMod(50f).build()));
	}
}
