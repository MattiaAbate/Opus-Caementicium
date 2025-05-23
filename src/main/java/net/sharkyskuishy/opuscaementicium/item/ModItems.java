package net.sharkyskuishy.opuscaementicium.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sharkyskuishy.opuscaementicium.OpusCaementicium;
import net.sharkyskuishy.opuscaementicium.item.custom.MortarBucket;
import net.sharkyskuishy.opuscaementicium.item.custom.PozzolanBall;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, OpusCaementicium.MOD_ID);

	public static final RegistryObject<Item> MORTAR_BUCKET = ITEMS.register("mortar_bucket",
			() -> new MortarBucket(new Item.Properties().setId(ITEMS.key("mortar_bucket")))
	);

	public static final RegistryObject<Item> POZZOLAN_BALL = ITEMS.register("pozzolan_ball",
			() -> new PozzolanBall(new Item.Properties().setId(ITEMS.key("pozzolan_ball")))
	);

	private static RegistryObject<Item> registerItem(String name, Item.Properties properties) {
		return ITEMS.register(name, () ->
				new Item(properties));
	}

	 
}