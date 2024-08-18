
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CombustibleRadiactivoItem extends Item {
	public CombustibleRadiactivoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
