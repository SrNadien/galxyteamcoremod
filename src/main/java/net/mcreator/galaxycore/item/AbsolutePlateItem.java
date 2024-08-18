
package net.mcreator.galaxycore.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AbsolutePlateItem extends Item {
	public AbsolutePlateItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}
}
