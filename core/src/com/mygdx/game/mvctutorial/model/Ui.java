package com.mygdx.game.mvctutorial.model;

import com.badlogic.ashley.core.Entity;
import com.mygdx.game.mvctutorial.model.components.DebugRenderComponent;
import com.mygdx.game.mvctutorial.model.components.StageComponent;

public class Ui extends Entity
{
	public Ui(float vp_width, float vp_height)
	{
		add(new StageComponent(vp_width, vp_height));
		add(new DebugRenderComponent());
	}
}
