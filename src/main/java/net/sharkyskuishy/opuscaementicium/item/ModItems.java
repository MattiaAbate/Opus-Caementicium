package net.sharkyskuishy.opuscaementicium.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sharkyskuishy.opuscaementicium.OpusCaementicium;

import java.util.function.Consumer;


public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, OpusCaementicium.MOD_ID);

	public static final RegistryObject<Item> MORTAR_BUCKET = ITEMS.register("mortar_bucket",
			() -> new Item(new Item.Properties().setId(ITEMS.key("mortar_bucket")))
	);

	public static final RegistryObject<Item> POZZOLAN_BALL = ITEMS.register("pozzolan_ball",
			() -> new Item(new Item.Properties().setId(ITEMS.key("pozzolan_ball")))
	);

	private static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
		return ITEMS.register(name, () ->
				new Item(properties) {
					@Override
					public void appendHoverText(ItemStack pStack, TooltipContext pContext, TooltipDisplay pTooltipDisplay, Consumer<Component> pTooltipAdder, TooltipFlag pFlag) {
						if (Screen.hasShiftDown()) {
							pTooltipAdder.accept(Component.translatable("tooltip.opuscaementicium." + name));
						} else {
							pTooltipAdder.accept(Component.translatable("tooltip.opuscaementicium.hint"));
						}

						super.appendHoverText(pStack, pContext, pTooltipDisplay, pTooltipAdder, pFlag);
					}
				});
	}

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}