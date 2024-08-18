
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HeartredItem extends Item {
	public HeartredItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
