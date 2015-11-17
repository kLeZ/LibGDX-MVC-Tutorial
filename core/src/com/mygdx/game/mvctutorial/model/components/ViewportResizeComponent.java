package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;

public class ViewportResizeComponent implements Component
{
	private float viewportWidth;
	private float viewportHeight;
	private int screenWidth;
	private int screenHeight;

	public float getViewportWidth()
	{
		return viewportWidth;
	}

	public void setViewportWidth(float viewportWidth)
	{
		this.viewportWidth = viewportWidth;
	}

	public float getViewportHeight()
	{
		return viewportHeight;
	}

	public void setViewportHeight(float viewportHeight)
	{
		this.viewportHeight = viewportHeight;
	}

	public void setViewportSize(float width, float height)
	{
		setViewportWidth(width);
		setViewportHeight(height);
	}

	public int getScreenWidth()
	{
		return screenWidth;
	}

	public void setScreenWidth(int screenWidth)
	{
		this.screenWidth = screenWidth;
	}

	public int getScreenHeight()
	{
		return screenHeight;
	}

	public void setScreenHeight(int screenHeight)
	{
		this.screenHeight = screenHeight;
	}

	public void setScreenSize(int width, int height)
	{
		setScreenWidth(width);
		setScreenHeight(height);
	}
}
