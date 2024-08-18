
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MiniReactorItem extends Item {
	public MiniReactorItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
