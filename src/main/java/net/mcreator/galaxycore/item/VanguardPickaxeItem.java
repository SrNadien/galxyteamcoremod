
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.galaxycore.init.GalaxyCoreModItems;

public class VanguardPickaxeItem extends PickaxeItem {
	public VanguardPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GalaxyCoreModItems.VANGUARDINGOT.get()));
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}
}
