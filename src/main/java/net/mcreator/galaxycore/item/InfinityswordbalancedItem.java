
package net.mcreator.galaxycore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class InfinityswordbalancedItem extends SwordItem {
	public InfinityswordbalancedItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 305f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
	}
}
