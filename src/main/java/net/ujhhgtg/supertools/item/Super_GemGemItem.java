
package net.ujhhgtg.supertools.item;

import net.ujhhgtg.supertools.itemgroup.ChaoJiGongJuItemGroup;
import net.ujhhgtg.supertools.SuperToolsModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SuperToolsModElements.ModElement.Tag
public class Super_GemGemItem extends SuperToolsModElements.ModElement {
	@ObjectHolder("super_tools:super_gem_gem")
	public static final Item block = null;
	public Super_GemGemItem(SuperToolsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ChaoJiGongJuItemGroup.tab).maxStackSize(64));
			setRegistryName("super_gem_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 5F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
