package com.mygdx.game.mvctutorial.controller;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntityListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.mvctutorial.model.components.BlueSquareComponent;
import com.mygdx.game.mvctutorial.model.components.BodyComponent;
import com.mygdx.game.mvctutorial.utils.Mappers;
import com.mygdx.game.mvctutorial.view.actors.BlueSquareActor;

public class StageController implements EntityListener
{
	private Stage stage;

	public StageController(Entity ui)
	{
		this.stage = Mappers.stageMap.get(ui).getStage();
	}

	@Override
	public void entityAdded(Entity entity)
	{
		BlueSquareComponent bsc = Mappers.blueSquareMap.get(entity);
		if (bsc != null)
		{
			stage.addActor(bsc.setActor(new BlueSquareActor(entity)));
		}
	}

	@Override
	public void entityRemoved(Entity entity)
	{
		BlueSquareComponent bsc = Mappers.blueSquareMap.get(entity);
		if (bsc != null)
		{
			BodyComponent bc = Mappers.bodyMap.get(entity);
			bc.getBody().getWorld().destroyBody(bc.getBody());
			bsc.getActor().remove();
			bsc.setActor(null);
		}
	}
}
