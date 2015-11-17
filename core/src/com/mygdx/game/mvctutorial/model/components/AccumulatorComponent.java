package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;

public class AccumulatorComponent implements Component
{
	private float accumulator = 0f;
	private int velocityInterations = 0;

	public AccumulatorComponent(int velocityInterations, int positionIterations)
	{
		this.velocityInterations = velocityInterations;
		this.positionIterations = positionIterations;
	}

	private int positionIterations = 0;

	public float getAccumulator()
	{
		return accumulator;
	}

	public int getVelocityInterations()
	{
		return velocityInterations;
	}

	public void setVelocityInterations(int velocityInterations)
	{
		this.velocityInterations = velocityInterations;
	}

	public int getPositionIterations()
	{
		return positionIterations;
	}

	public void setPositionIterations(int positionIterations)
	{
		this.positionIterations = positionIterations;
	}

	public void increase(float delta)
	{
		accumulator += delta;
	}

	public void decrease(float delta)
	{
		accumulator -= delta;
	}
}
