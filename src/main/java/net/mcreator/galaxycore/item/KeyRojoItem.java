
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KeyRojoItem extends Item {
	public KeyRojoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
