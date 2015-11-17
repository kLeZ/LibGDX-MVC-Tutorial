package com.mygdx.game.mvctutorial.model.systems;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.systems.IntervalIteratingSystem;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.physics.box2d.World;
import com.mygdx.game.mvctutorial.model.BlueSquare;
import com.mygdx.game.mvctutorial.model.components.*;
import com.mygdx.game.mvctutorial.utils.Families;
import com.mygdx.game.mvctutorial.utils.Helpers;
import com.mygdx.game.mvctutorial.utils.Mappers;

public class RespawnSystem extends IntervalIteratingSystem
{
	private Entity gameWorld;

	public RespawnSystem(Entity gameWorld)
	{
		super(Families.blueSquare, 5f);
		this.gameWorld = gameWorld;
	}

	@Override
	protected void processEntity(Entity entity)
	{
		BlueSquareComponent bsc = Mappers.blueSquareMap.get(entity);
		if (bsc != null)
		{
			getEngine().removeEntity(entity);
			getEngine().addEntity(createBlueSquare(gameWorld));
		}
	}

	public BlueSquare createBlueSquare(Entity entity)
	{
		World world = Mappers.worldMap.get(entity).getWorld();
		float factor = Mappers.gameSettingsMap.get(entity).getWorldToScreen();

		BlueSquare ret = new BlueSquare(world);
		SizeComponent sc = new SizeComponent(1.5f, 1.5f);
		ret.add(sc);
		ret.add(new TextureComponent(Helpers.createTexture((int) sc.getScreenWidth(factor), (int) sc.getScreenHeight(factor), Color.BLUE)));
		ret.add(new BodyComponent(Helpers.initBody(world, 0.0f, 0.0f, sc.getWidth(), sc.getHeight(), false, 5f, 0.3f)));
		ret.add(new VelocityComponent(2.0f, 0f));
		ret.add(new LinearInpulseComponent(0, 25f));
		return ret;
	}
}
