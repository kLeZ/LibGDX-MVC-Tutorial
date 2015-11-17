package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;

public class SizeComponent implements Component
{
	private float width;
	private float height;

	public SizeComponent(float width, float height)
	{
		this.width = width;
		this.height = height;
	}

	public float getWidth()
	{
		return width;
	}

	public float getScreenWidth(float factor)
	{
		return width * factor;
	}

	public void setWidth(float width)
	{
		this.width = width;
	}

	public float getHeight()
	{
		return height;
	}

	public float getScreenHeight(float factor)
	{
		return height * factor;
	}

	public void setHeight(float height)
	{
		this.height = height;
	}

	public void setSize(float width, float height)
	{
		setWidth(width);
		setHeight(height);
	}
}
