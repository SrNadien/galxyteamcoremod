
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Hub1Item extends Item {
	public Hub1Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}