
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnderiumBaseItem extends Item {
	public EnderiumBaseItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
