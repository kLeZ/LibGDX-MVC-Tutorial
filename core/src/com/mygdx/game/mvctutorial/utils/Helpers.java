package com.mygdx.game.mvctutorial.utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;

public class Helpers
{

	public static Body initBody(World world, float x, float y, float width, float height, boolean rotate, float gravityScale, float density)
	{
		BodyDef bodyDef = new BodyDef();
		bodyDef.position.set((x + width / 2), (y + height / 2));

		bodyDef.fixedRotation = !rotate;
		bodyDef.type = BodyType.DynamicBody;

		Body body = world.createBody(bodyDef);
		body.setGravityScale(gravityScale);

		PolygonShape shape = new PolygonShape();
		shape.setAsBox((width / 2), (height / 2));
		body.createFixture(shape, density);
		shape.dispose();

		return body;
	}

	public static Texture createTexture(int width, int height, Color color)
	{
		Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);
		pixmap.setColor(color);
		pixmap.fill();
		Texture _texture = new Texture(pixmap);
		pixmap.dispose();
		return _texture;
	}
}
