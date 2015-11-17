package com.mygdx.game.mvctutorial.model.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.mvctutorial.model.components.DebugRenderComponent;
import com.mygdx.game.mvctutorial.model.components.StageComponent;
import com.mygdx.game.mvctutorial.utils.Families;
import com.mygdx.game.mvctutorial.utils.Mappers;

public class UiSystem extends IteratingSystem
{
	private Entity gameWorld;

	public UiSystem(Entity gameWorld)
	{
		super(Families.ui);
		this.gameWorld = gameWorld;
	}

	@Override
	protected void processEntity(Entity entity, float deltaTime)
	{
		StageComponent sc = Mappers.stageMap.get(entity);
		DebugRenderComponent drc = Mappers.debugRenderMap.get(entity);
		if (sc != null)
		{
			if (!Mappers.gameSettingsMap.get(gameWorld).isPaused())
			{
				sc.getStage().act(deltaTime);
			}
			sc.getStage().draw();
			if (drc != null)
			{
				World world = Mappers.worldMap.get(gameWorld).getWorld();
				drc.getBox2dRender().render(world, sc.getStage().getCamera().combined);
			}
		}
	}
}
