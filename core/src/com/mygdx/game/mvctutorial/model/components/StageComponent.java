package com.mygdx.game.mvctutorial.model.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;

public class StageComponent implements Component
{
	private Stage stage;

	public StageComponent(float vp_width, float vp_height)
	{
		this.stage = createStage(vp_width, vp_height);
	}

	public Stage getStage()
	{
		return stage;
	}

	public static Stage createStage(float vp_width, float vp_height)
	{
		Stage stage = new Stage(new ScalingViewport(Scaling.fill, vp_width, vp_height));
		stage.getViewport().setCamera(new OrthographicCamera(vp_width, vp_height));
		((OrthographicCamera) stage.getCamera()).position.set(((OrthographicCamera) stage.getCamera()).viewportWidth / 2, ((OrthographicCamera) stage.getCamera()).viewportHeight / 2, 0f);
		((OrthographicCamera) stage.getCamera()).zoom = 1f;
		((OrthographicCamera) stage.getCamera()).update();
		return stage;
	}
}
