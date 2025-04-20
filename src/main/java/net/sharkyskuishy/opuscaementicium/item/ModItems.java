package net.sharkyskuishy.opuscaementicium.item;


import net.sharkyskuishy.opuscaementicium.OpusCaementicium;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OpusCaementicium.MOD_ID);

    public static final RegistryObject<Item> MORTAR_BUCKET = ITEMS.register("mortar_bucket",
        () -> new Item(new Item.Properties().setId(ITEMS.key("mortar_bucket"))));

    public static final RegistryObject<Item> POZZOLAN_BALL = ITEMS.register("pozzolan_ball",
            () -> new Item(new Item.Properties().setId(ITEMS.key("pozzolan_ball"))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
