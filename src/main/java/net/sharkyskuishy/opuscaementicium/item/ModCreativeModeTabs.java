package net.sharkyskuishy.opuscaementicium.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sharkyskuishy.opuscaementicium.OpusCaementicium;
import net.sharkyskuishy.opuscaementicium.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OpusCaementicium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OPUS_CAEMENTICIUM_ITEMS_TAB = CREATIVE_MOD_TABS.register("opus_caementicium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OPUS_QUADRATUM.get()))
                    .title(Component.translatable("creative_tab.opuscaementicium.opus_caementicium_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.QUICKLIME.get());
                        output.accept(ModBlocks.POZZOLAN.get());
                        output.accept(ModItems.POZZOLAN_BALL.get());
                        output.accept(ModItems.MORTAR_BUCKET.get());
                        output.accept(ModBlocks.OPUS_QUADRATUM.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}