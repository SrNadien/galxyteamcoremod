
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SuperSemillaItem extends Item {
	public SuperSemillaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}