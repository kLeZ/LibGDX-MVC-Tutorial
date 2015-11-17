package com.mygdx.game.mvctutorial;

import com.badlogic.ashley.core.Engine;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.mvctutorial.model.GameWorld;
import com.mygdx.game.mvctutorial.model.components.GameSettingsComponent;
import com.mygdx.game.mvctutorial.model.systems.AccumulatorSystem;
import com.mygdx.game.mvctutorial.model.systems.JumpingSystem;
import com.mygdx.game.mvctutorial.model.systems.MovementSystem;
import com.mygdx.game.mvctutorial.view.screens.GameScreen;

public class MvcGame extends Game
{
	private float width;
	private float height;
	private Engine engine;

	public MvcGame(float width, float height)
	{
		this.width = width;
		this.height = height;
	}

	@Override
	public void create()
	{
		GameSettingsComponent settings = new GameSettingsComponent();
		settings.setGuiWidth(width);
		settings.setGuiHeight(height);
		settings.setWorldToScreen(32f);
		settings.setGravity(new Vector2(0, -9.81f));
		settings.setTimeStep(1 / 300f);
		settings.setPaused(false);

		GameWorld gameWorld = new GameWorld(settings);

		engine = new Engine();
		engine.addEntity(gameWorld);

		engine.addSystem(new AccumulatorSystem());
		engine.addSystem(new MovementSystem());
		engine.addSystem(new JumpingSystem());

		setScreen(new GameScreen(engine, gameWorld.getId()));
	}

	@Override
	public void render()
	{
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		glClearColor(Color.BLACK);

		super.render();
	}

	public static void glClearColor(Color color)
	{
		Gdx.gl.glClearColor(color.r, color.g, color.b, color.a);
	}
}
