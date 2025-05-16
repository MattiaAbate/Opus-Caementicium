package net.sharkyskuishy.opuscaementicium.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sharkyskuishy.opuscaementicium.OpusCaementicium;

import javax.annotation.Nullable;
import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OpusCaementicium.MOD_ID);

    public static final RegistryObject<Item> MORTAR_BUCKET = ITEMS.register("mortar_bucket",
            () -> new Item(new Item.Properties().setId(ITEMS.key("mortar_bucket"))));

    public static final RegistryObject<Item> POZZOLAN_BALL = ITEMS.register("pozzolan_ball",
            () -> new Item(new Item.Properties().setId(ITEMS.key("pozzolan_ball"))));

    private static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
        return ITEMS.register(name, () ->
                new Item(properties) /*{
                    @Override
                    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
                        if (Screen.hasShiftDown()) {
                            tooltip.add(Component.translatable("tooltip.opuscaementicium." + name));
                        } else {
                            tooltip.add(Component.translatable("tooltip.opuscaementicium.hint"));
                        }
                    }
                }*/);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}