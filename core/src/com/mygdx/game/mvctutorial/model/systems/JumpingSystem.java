package com.mygdx.game.mvctutorial.model.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.systems.IntervalIteratingSystem;
import com.mygdx.game.mvctutorial.model.components.BodyComponent;
import com.mygdx.game.mvctutorial.model.components.LinearInpulseComponent;
import com.mygdx.game.mvctutorial.utils.Families;
import com.mygdx.game.mvctutorial.utils.Mappers;

public class JumpingSystem extends IntervalIteratingSystem
{
	public JumpingSystem()
	{
		super(Families.jumpers, 1f);
	}

	@Override
	protected void processEntity(Entity entity)
	{
		BodyComponent bc = Mappers.bodyMap.get(entity);
		LinearInpulseComponent lic = Mappers.linearImpulseMap.get(entity);

		bc.getBody().applyLinearImpulse(lic.getLinearImpulse(), bc.getBody().getWorldCenter(), true);
	}
}
