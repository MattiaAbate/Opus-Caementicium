package net.sharkyskuishy.opuscaementicium.block;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sharkyskuishy.opuscaementicium.OpusCaementicium;
import net.sharkyskuishy.opuscaementicium.item.ModItems;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OpusCaementicium.MOD_ID);

    public static final RegistryObject<Block> QUICKLIME = registerBlock("quicklime",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f, 1f)
                    .sound(SoundType.DRIPSTONE_BLOCK)
                    .requiresCorrectToolForDrops()
                    .setId(BLOCKS.key("quicklime")))
    );

    public static final RegistryObject<Block> POZZOLAN = registerBlock("pozzolan",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.6f)
                    .sound(SoundType.GRAVEL)
                    .setId(BLOCKS.key("pozzolan")))
    );

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () ->
                new BlockItem(block.get(), new Item.Properties().setId(ModItems.ITEMS.key(name)))
        );
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}