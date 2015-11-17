package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BlueSquareComponent implements Component
{
	private Actor actor;

	public Actor getActor()
	{
		return actor;
	}

	public Actor setActor(Actor actor)
	{
		this.actor = actor;
		return this.actor;
	}
}
