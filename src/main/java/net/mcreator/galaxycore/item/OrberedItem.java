
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OrberedItem extends Item {
	public OrberedItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
