package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;

public class GameSettingsComponent implements Component
{

	private float worldToScreen;
	private float guiWidth;
	private float guiHeight;
	private Vector2 gravity;
	private float timeStep;
	private boolean paused;

	public float getWorldToScreen()
	{
		return worldToScreen;
	}

	public void setWorldToScreen(float worldToScreen)
	{
		this.worldToScreen = worldToScreen;
	}

	public float fromScreenToWorld(float worldCoord)
	{
		return worldCoord / getWorldToScreen();
	}

	public float fromWorldToScreen(float worldCoord)
	{
		return worldCoord * getWorldToScreen();
	}

	public float getGuiWidth()
	{
		return guiWidth;
	}

	public void setGuiWidth(float guiWidth)
	{
		this.guiWidth = guiWidth;
	}

	public float getGuiHeight()
	{
		return guiHeight;
	}

	public void setGuiHeight(float guiHeight)
	{
		this.guiHeight = guiHeight;
	}

	public float getWorldWidth()
	{
		return fromScreenToWorld(getGuiWidth());
	}

	public float getWorldHeight()
	{
		return fromScreenToWorld(getGuiHeight());
	}

	public Vector2 getGravity()
	{
		return gravity;
	}

	public void setGravity(Vector2 gravity)
	{
		this.gravity = gravity;
	}

	public float getTimeStep()
	{
		return timeStep;
	}

	public void setTimeStep(float timeStep)
	{
		this.timeStep = timeStep;
	}

	public boolean isPaused()
	{
		return paused;
	}

	public void setPaused(boolean paused)
	{
		this.paused = paused;
	}
}
