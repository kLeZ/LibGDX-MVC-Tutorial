package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;

public class VelocityComponent implements Component
{
	private float x;
	private float y;

	public VelocityComponent(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	public float getX()
	{
		return x;
	}

	public void setX(float x)
	{
		this.x = x;
	}

	public float getY()
	{
		return y;
	}

	public void setY(float y)
	{
		this.y = y;
	}

	public void setVelocity(float x, float y)
	{
		setX(x);
		setY(y);
	}
}
