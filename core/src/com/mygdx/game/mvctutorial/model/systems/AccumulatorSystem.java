package com.mygdx.game.mvctutorial.model.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.systems.IteratingSystem;
import com.mygdx.game.mvctutorial.model.components.AccumulatorComponent;
import com.mygdx.game.mvctutorial.model.components.GameSettingsComponent;
import com.mygdx.game.mvctutorial.model.components.WorldComponent;
import com.mygdx.game.mvctutorial.utils.Families;
import com.mygdx.game.mvctutorial.utils.Mappers;

public class AccumulatorSystem extends IteratingSystem
{
	public AccumulatorSystem()
	{
		super(Families.gameWorldFamily);
	}

	@Override
	protected void processEntity(Entity entity, float deltaTime)
	{
		AccumulatorComponent ac = Mappers.accumulatorMap.get(entity);
		WorldComponent wc = Mappers.worldMap.get(entity);
		GameSettingsComponent gsc = Mappers.gameSettingsMap.get(entity);

		// Fixed timestep
		ac.increase(deltaTime);

		while (ac.getAccumulator() >= deltaTime)
		{
			wc.getWorld().step(gsc.getTimeStep(), ac.getVelocityInterations(), ac.getPositionIterations());
			ac.decrease(gsc.getTimeStep());
		}
	}
}
