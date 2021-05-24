package net.eclips_e.jokemod.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;

import net.eclips_e.jokemod.JokemodModElements;
import net.eclips_e.jokemod.JokemodMod;

import java.util.Map;

@JokemodModElements.ModElement.Tag
public class TrollFaceRightClickedInAirProcedure extends JokemodModElements.ModElement {
	public TrollFaceRightClickedInAirProcedure(JokemodModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JokemodMod.LOGGER.warn("Failed to load dependency entity for procedure TrollFaceRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				JokemodMod.LOGGER.warn("Failed to load dependency world for procedure TrollFaceRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent(
						(("My coordinates are:") + "" + ((((entity.getPosX())) + "" + ((((entity.getPosY())) + "" + ((entity.getPosZ())))))))),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
