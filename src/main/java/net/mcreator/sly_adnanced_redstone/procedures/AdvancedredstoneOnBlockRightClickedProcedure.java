package net.mcreator.sly_adnanced_redstone.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneModElements;
import net.mcreator.sly_adnanced_redstone.SlyAdnancedRedstoneMod;

import java.util.Map;

@SlyAdnancedRedstoneModElements.ModElement.Tag
public class AdvancedredstoneOnBlockRightClickedProcedure extends SlyAdnancedRedstoneModElements.ModElement {
	public AdvancedredstoneOnBlockRightClickedProcedure(SlyAdnancedRedstoneModElements instance) {
		super(instance, 21);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SlyAdnancedRedstoneMod.LOGGER.warn("Failed to load dependency entity for procedure AdvancedredstoneOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			public int getScore(String score) {
				if (entity instanceof PlayerEntity) {
					Scoreboard _sc = ((PlayerEntity) entity).getWorldScoreboard();
					ScoreObjective _so = _sc.getObjective(score);
					if (_so != null) {
						Score _scr = _sc.getOrCreateScore(((PlayerEntity) entity).getScoreboardName(), _so);
						return _scr.getScorePoints();
					}
				}
				return 0;
			}
		}.getScore("wireless")) == 0)) {
			{
				Entity _ent = entity;
				if (_ent instanceof PlayerEntity) {
					Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
					ScoreObjective _so = _sc.getObjective("wireless");
					if (_so == null) {
						_so = _sc.addObjective("wireless", ScoreCriteria.DUMMY, new StringTextComponent("wireless"),
								ScoreCriteria.RenderType.INTEGER);
					}
					Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
					_scr.setScorePoints((int) 1);
				}
			}
		} else {
			{
				Entity _ent = entity;
				if (_ent instanceof PlayerEntity) {
					Scoreboard _sc = ((PlayerEntity) _ent).getWorldScoreboard();
					ScoreObjective _so = _sc.getObjective("wireless");
					if (_so == null) {
						_so = _sc.addObjective("wireless", ScoreCriteria.DUMMY, new StringTextComponent("wireless"),
								ScoreCriteria.RenderType.INTEGER);
					}
					Score _scr = _sc.getOrCreateScore(((PlayerEntity) _ent).getScoreboardName(), _so);
					_scr.setScorePoints((int) 0);
				}
			}
		}
	}
}
