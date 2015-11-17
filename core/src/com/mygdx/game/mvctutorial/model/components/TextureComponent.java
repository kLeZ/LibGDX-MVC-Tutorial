package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.Texture;

public class TextureComponent implements Component
{
	private Texture texture;

	public TextureComponent(Texture texture)
	{
		this.texture = texture;
	}

	public Texture getTexture()
	{
		return texture;
	}

	public void setTexture(Texture texture)
	{
		this.texture = texture;
	}
}
