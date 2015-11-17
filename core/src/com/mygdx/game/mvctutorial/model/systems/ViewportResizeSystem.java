package com.mygdx.game.mvctutorial.model.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.mvctutorial.model.components.StageComponent;
import com.mygdx.game.mvctutorial.model.components.ViewportResizeComponent;
import com.mygdx.game.mvctutorial.utils.Families;
import com.mygdx.game.mvctutorial.utils.Mappers;

public class ViewportResizeSystem extends IteratingSystem
{
	public ViewportResizeSystem()
	{
		super(Families.resizables);
	}

	@Override
	protected void processEntity(Entity entity, float deltaTime)
	{
		ViewportResizeComponent vrc = Mappers.viewportResizeMap.get(entity);
		StageComponent sc = Mappers.stageMap.get(entity);

		Viewport vp = sc.getStage().getViewport();
		vp.update(vrc.getScreenWidth(), vrc.getScreenHeight(), true);
		vp.setWorldSize(vrc.getViewportWidth(), vrc.getViewportHeight());

		entity.remove(ViewportResizeComponent.class);
	}
}
