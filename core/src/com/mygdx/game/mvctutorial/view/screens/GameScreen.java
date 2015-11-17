package com.mygdx.game.mvctutorial.view.screens;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.gdx.Screen;
import com.mygdx.game.mvctutorial.controller.StageController;
import com.mygdx.game.mvctutorial.model.Ui;
import com.mygdx.game.mvctutorial.model.components.GameSettingsComponent;
import com.mygdx.game.mvctutorial.model.components.ViewportResizeComponent;
import com.mygdx.game.mvctutorial.model.systems.RespawnSystem;
import com.mygdx.game.mvctutorial.model.systems.UiSystem;
import com.mygdx.game.mvctutorial.model.systems.ViewportResizeSystem;
import com.mygdx.game.mvctutorial.utils.Mappers;

public class GameScreen implements Screen
{
	private Engine engine;
	private Entity gameWorld;
	private Entity ui;

	public GameScreen(Engine engine, long gameWorldId)
	{
		this.engine = engine;
		gameWorld = engine.getEntity(gameWorldId);

		GameSettingsComponent settings = Mappers.gameSettingsMap.get(gameWorld);
		ui = new Ui(settings.getWorldWidth(), settings.getWorldHeight());
		engine.addEntity(ui);
	}

	@Override
	public void show()
	{
		RespawnSystem respawner = new RespawnSystem(gameWorld);
		engine.addSystem(respawner);
		engine.addSystem(new UiSystem(gameWorld));
		engine.addSystem(new ViewportResizeSystem());

		engine.addEntityListener(new StageController(ui));
		engine.addEntity(respawner.createBlueSquare(gameWorld));
	}

	@Override
	public void render(float delta)
	{
		engine.update(delta);
	}

	@Override
	public void resize(int width, int height)
	{
		GameSettingsComponent settings = Mappers.gameSettingsMap.get(gameWorld);

		ViewportResizeComponent vrc = new ViewportResizeComponent();
		vrc.setScreenSize(width, height);
		vrc.setViewportSize(settings.fromScreenToWorld(width), settings.fromScreenToWorld(height));

		ui.add(vrc);
	}

	@Override
	public void pause()
	{
		for (EntitySystem sys : engine.getSystems())
		{
			sys.setProcessing(false);
		}
		engine.getSystem(UiSystem.class).setProcessing(true);
		Mappers.gameSettingsMap.get(gameWorld).setPaused(true);
	}

	@Override
	public void resume()
	{
		for (EntitySystem sys : engine.getSystems())
		{
			sys.setProcessing(true);
		}
		Mappers.gameSettingsMap.get(gameWorld).setPaused(false);
	}

	@Override
	public void hide()
	{
	}

	@Override
	public void dispose()
	{
	}
}
