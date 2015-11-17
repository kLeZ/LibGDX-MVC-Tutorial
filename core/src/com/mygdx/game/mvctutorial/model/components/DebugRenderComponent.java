package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;

public class DebugRenderComponent implements Component
{
	private Box2DDebugRenderer box2dRender;

	public DebugRenderComponent()
	{
		this(new Box2DDebugRenderer());
	}

	public DebugRenderComponent(Box2DDebugRenderer box2dRender)
	{
		this.box2dRender = box2dRender;
	}

	public Box2DDebugRenderer getBox2dRender()
	{
		return box2dRender;
	}
}
