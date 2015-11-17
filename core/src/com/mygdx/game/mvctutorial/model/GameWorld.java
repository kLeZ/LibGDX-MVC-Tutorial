package com.mygdx.game.mvctutorial.model;

import com.badlogic.ashley.core.Entity;
import com.mygdx.game.mvctutorial.model.components.AccumulatorComponent;
import com.mygdx.game.mvctutorial.model.components.GameSettingsComponent;
import com.mygdx.game.mvctutorial.model.components.WorldComponent;

public class GameWorld extends Entity
{
	public GameWorld(GameSettingsComponent settings)
	{
		add(settings);
		add(new WorldComponent(settings.getGravity(), false));
		add(new AccumulatorComponent(10, 5));
	}
}
