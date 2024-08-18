
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HubItem extends Item {
	public HubItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
