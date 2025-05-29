package net.sharkyskuishy.opuscaementicium.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.sharkyskuishy.opuscaementicium.OpusCaementicium;

import java.util.function.Consumer;

public class PozzolanBall extends Item {
	public PozzolanBall(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public void appendHoverText(ItemStack pStack, TooltipContext pContext, TooltipDisplay pTooltipDisplay, Consumer<Component> pTooltipAdder, TooltipFlag pFlag) {
		if (Screen.hasShiftDown()) {
			pTooltipAdder.accept(Component.translatable("tooltip." + OpusCaementicium.MOD_ID + ".pozzolan_ball"));
		} else {
			pTooltipAdder.accept(Component.translatable(OpusCaementicium.HINT_TOOLTIP_KEY));
		}

		super.appendHoverText(pStack, pContext, pTooltipDisplay, pTooltipAdder, pFlag);
	}
}