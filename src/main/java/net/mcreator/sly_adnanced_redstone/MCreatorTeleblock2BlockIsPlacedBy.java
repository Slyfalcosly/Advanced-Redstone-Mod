package net.mcreator.sly_adnanced_redstone;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;

@Elementssly_adnanced_redstone.ModElement.Tag
public class MCreatorTeleblock2BlockIsPlacedBy extends Elementssly_adnanced_redstone.ModElement {
	public MCreatorTeleblock2BlockIsPlacedBy(Elementssly_adnanced_redstone instance) {
		super(instance, 75);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorTeleblock2BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorTeleblock2BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorTeleblock2BlockIsPlacedBy!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorTeleblock2BlockIsPlacedBy!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location211 = (double) x;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location212 = (double) (y + 1);
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		sly_adnanced_redstoneVariables.MapVariables.get(world).Location213 = (double) z;
		sly_adnanced_redstoneVariables.MapVariables.get(world).syncData(world);
		world.playSound((PlayerEntity) null, x, y, z,
				(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.hit")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
	}
}