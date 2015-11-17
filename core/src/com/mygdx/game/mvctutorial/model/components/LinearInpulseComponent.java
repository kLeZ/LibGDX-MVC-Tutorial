package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;

public class LinearInpulseComponent implements Component
{
	private float x;
	private float y;

	public LinearInpulseComponent(float x, float y)
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

	public Vector2 getLinearImpulse()
	{
		return new Vector2(getX(), getY());
	}
}
