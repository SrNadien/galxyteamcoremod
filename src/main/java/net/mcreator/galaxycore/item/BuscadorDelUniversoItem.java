
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BuscadorDelUniversoItem extends Item {
	public BuscadorDelUniversoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}