package com.mygdx.game.mvctutorial.view.actors;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.mvctutorial.model.BlueSquare;
import com.mygdx.game.mvctutorial.model.components.BodyComponent;
import com.mygdx.game.mvctutorial.model.components.SizeComponent;
import com.mygdx.game.mvctutorial.model.components.TextureComponent;
import com.mygdx.game.mvctutorial.utils.Mappers;

public class BlueSquareActor extends Actor
{
	private BlueSquare entity;
	private TextureRegion texture;

	public BlueSquareActor(Entity entity)
	{
		this.entity = (BlueSquare) entity;
		init();
	}

	public void init()
	{
		BodyComponent bc = Mappers.bodyMap.get(entity);
		SizeComponent sc = Mappers.sizeMap.get(entity);
		TextureComponent tc = Mappers.textureMap.get(entity);

		Vector2 pos = bc.getBody().getPosition().cpy();
		pos.sub(sc.getWidth() / 2, sc.getHeight() / 2);
		setBounds(pos.x, pos.y, sc.getWidth(), sc.getHeight());
		texture = new TextureRegion(tc.getTexture(), (int) sc.getWidth(), (int) sc.getHeight());
	}

	@Override
	public void act(float delta)
	{
		super.act(delta);
		BodyComponent bc = Mappers.bodyMap.get(entity);
		SizeComponent sc = Mappers.sizeMap.get(entity);
		TextureComponent tc = Mappers.textureMap.get(entity);

		Vector2 pos = bc.getBody().getPosition().cpy();
		pos.sub(sc.getWidth() / 2, sc.getHeight() / 2);
		setBounds(pos.x, pos.y, sc.getWidth(), sc.getHeight());
		texture = new TextureRegion(tc.getTexture(), (int) sc.getWidth(), (int) sc.getHeight());
	}

	@Override
	public void draw(Batch batch, float parentAlpha)
	{
		super.draw(batch, parentAlpha);
		batch.draw(texture, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}
}
