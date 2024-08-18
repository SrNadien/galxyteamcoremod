
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RedstoneAlloyItem extends Item {
	public RedstoneAlloyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
