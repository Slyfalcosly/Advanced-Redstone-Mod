package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModVariables;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class Teleblock11BlockDestroyedByPlayerProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public Teleblock11BlockDestroyedByPlayerProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 72);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency world for procedure Teleblock11BlockDestroyedByPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location121 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location122 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Location123 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).Dim11 = (double) 0;
		SlyAdnancedRedstoneModVariables.MapVariables.get(world).syncData(world);
	}
}
