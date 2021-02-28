package net.mcreator.sly_adnanced_redstone;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorRedscBlockAdded extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorRedscBlockAdded(Elementssly_adnanced_redstone instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorRedscBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorRedscBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorRedscBlockAdded!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorRedscBlockAdded!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == MCreatorLitred.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), MCreatorRedsc.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == MCreatorLitred.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), MCreatorRedsc.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == MCreatorLitred.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), MCreatorRedsc.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == MCreatorLitred.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), MCreatorRedsc.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == MCreatorLitred.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), MCreatorRedsc.block.getDefaultState(), 3);
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == MCreatorLitred.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), MCreatorRedsc.block.getDefaultState(), 3);
		}
	}
}
