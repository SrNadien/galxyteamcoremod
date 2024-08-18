
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DarkSteelItem extends Item {
	public DarkSteelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
