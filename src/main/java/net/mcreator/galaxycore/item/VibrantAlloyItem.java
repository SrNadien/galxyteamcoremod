
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VibrantAlloyItem extends Item {
	public VibrantAlloyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
