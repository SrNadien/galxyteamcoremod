
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EndSteelNuggetItem extends Item {
	public EndSteelNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
