
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SkullgreyItem extends Item {
	public SkullgreyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
