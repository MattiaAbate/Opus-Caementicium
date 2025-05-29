package net.sharkyskuishy.opuscaementicium.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class CementingTable extends BaseEntityBlock {
	public CementingTable(Properties pProperties) {
		super(pProperties);
	}

	@Override
	protected MapCodec<? extends BaseEntityBlock> codec() {
		return null;
	}

	@Override
	public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
		return null;
	}
}