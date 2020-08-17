
package net.ujhhgtg.supertools.itemgroup;

import net.ujhhgtg.supertools.item.Super_GemGemItem;
import net.ujhhgtg.supertools.SuperToolsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SuperToolsModElements.ModElement.Tag
public class ChaoJiGongJuItemGroup extends SuperToolsModElements.ModElement {
	public ChaoJiGongJuItemGroup(SuperToolsModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabchao_ji_gong_ju") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Super_GemGemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
