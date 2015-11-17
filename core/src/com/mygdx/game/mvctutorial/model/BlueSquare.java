package com.mygdx.game.mvctutorial.model;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.mvctutorial.model.components.BlueSquareComponent;

public class BlueSquare extends Entity
{
	public BlueSquare(World world)
	{
		add(new BlueSquareComponent());
	}
}
