
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Hub2Item extends Item {
	public Hub2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
