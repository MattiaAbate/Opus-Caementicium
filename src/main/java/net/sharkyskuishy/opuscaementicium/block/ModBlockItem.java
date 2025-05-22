package net.sharkyskuishy.opuscaementicium.block;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;
import net.sharkyskuishy.opuscaementicium.OpusCaementicium;

import java.util.function.Consumer;

public class ModBlockItem extends BlockItem {
	public ModBlockItem(Block pBlock, Properties pProperties) {
		super(pBlock, pProperties);
	}

	@Override
	public void appendHoverText(ItemStack pStack, TooltipContext pContext, TooltipDisplay pTooltipDisplay, Consumer<Component> pTooltipAdder, TooltipFlag pFlag) {
		if (Screen.hasShiftDown()) {
			pTooltipAdder.accept(Component.translatable(getDescriptionId()));
		} else {
			pTooltipAdder.accept(Component.translatable(OpusCaementicium.HINT_TOOLTIP_KEY));
		}

		super.appendHoverText(pStack, pContext, pTooltipDisplay, pTooltipAdder, pFlag);
	}
}
