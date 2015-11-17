package com.mygdx.game.mvctutorial.model.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.systems.IteratingSystem;
import com.mygdx.game.mvctutorial.model.components.BodyComponent;
import com.mygdx.game.mvctutorial.model.components.VelocityComponent;
import com.mygdx.game.mvctutorial.utils.Families;
import com.mygdx.game.mvctutorial.utils.Mappers;

public class MovementSystem extends IteratingSystem
{
	public MovementSystem()
	{
		super(Families.movers);
	}

	public void processEntity(Entity entity, float deltaTime)
	{
		BodyComponent bc = Mappers.bodyMap.get(entity);
		VelocityComponent vc = Mappers.velocityMap.get(entity);

		bc.getBody().setLinearVelocity(vc.getX(), vc.getY());
	}
}
