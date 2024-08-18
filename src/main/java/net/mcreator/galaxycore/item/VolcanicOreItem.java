
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VolcanicOreItem extends Item {
	public VolcanicOreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
