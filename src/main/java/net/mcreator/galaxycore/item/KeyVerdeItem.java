
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KeyVerdeItem extends Item {
	public KeyVerdeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
