package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class WorldComponent implements Component
{
	private World world;

	public WorldComponent(Vector2 gravity, boolean doSleep)
	{
		world = new World(gravity, doSleep);
	}

	public World getWorld()
	{
		return world;
	}
}
