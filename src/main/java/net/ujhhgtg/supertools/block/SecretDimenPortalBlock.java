
package net.ujhhgtg.supertools.block;

import net.ujhhgtg.supertools.itemgroup.ChaoJiGongJuItemGroup;
import net.ujhhgtg.supertools.SuperToolsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@SuperToolsModElements.ModElement.Tag
public class SecretDimenPortalBlock extends SuperToolsModElements.ModElement {
	@ObjectHolder("super_tools:secret_dimen_portal")
	public static final Block block = null;
	public SecretDimenPortalBlock(SuperToolsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ChaoJiGongJuItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.SCAFFOLDING).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("secret_dimen_portal");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
