package com.mygdx.game.mvctutorial.utils;

import com.badlogic.ashley.core.Family;
import com.mygdx.game.mvctutorial.model.components.*;

@SuppressWarnings("unchecked")
public class Families
{
	public static Family gameWorldFamily = Family.all(GameSettingsComponent.class, WorldComponent.class, AccumulatorComponent.class).get();
	public static Family jumpers = Family.all(BodyComponent.class, LinearInpulseComponent.class).get();
	public static Family movers = Family.all(BodyComponent.class, VelocityComponent.class).get();
	public static Family blueSquare = Family.all(BlueSquareComponent.class).get();
	public static Family ui = Family.one(StageComponent.class, DebugRenderComponent.class).get();
	public static Family resizables = Family.all(StageComponent.class, ViewportResizeComponent.class).get();
}
