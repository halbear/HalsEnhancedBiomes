package heb.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import java.util.Map;

import heb.block.FallingleavesBlock;

import heb.HebMod;

public class FallingLeavesSurfaceOnStructureInstanceGeneratedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				HebMod.LOGGER.warn("Failed to load dependency world for procedure FallingLeavesSurfaceOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				HebMod.LOGGER.warn("Failed to load dependency x for procedure FallingLeavesSurfaceOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				HebMod.LOGGER.warn("Failed to load dependency y for procedure FallingLeavesSurfaceOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				HebMod.LOGGER.warn("Failed to load dependency z for procedure FallingLeavesSurfaceOnStructureInstanceGenerated!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			world.setBlockState(new BlockPos(x, y - 1, z), FallingleavesBlock.block.getDefaultState(), 3);
		}
	}
}
