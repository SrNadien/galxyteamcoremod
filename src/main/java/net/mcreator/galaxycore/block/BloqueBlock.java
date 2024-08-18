
package net.mcreator.galaxycore.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BloqueBlock extends Block {
	public BloqueBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> 10).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)
				.isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(3, 0, 4, 12, 9, 13), box(3.25, 0.25, 3.8, 11.75, 8.75, 4.8), box(3.25, 0.25, 12.2, 11.75, 8.75, 13.2), box(2.75, 0.25, 4.2, 3.75, 8.75, 12.7), box(11.25, 0.25, 4.2, 12.25, 8.75, 12.7),
				box(3.25, 8.25, 4.2, 11.75, 9.25, 12.7));
	}
}
