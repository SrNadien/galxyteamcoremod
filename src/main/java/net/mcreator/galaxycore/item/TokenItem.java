
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TokenItem extends Item {
	public TokenItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
