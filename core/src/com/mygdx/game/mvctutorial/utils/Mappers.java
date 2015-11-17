package com.mygdx.game.mvctutorial.utils;

import com.badlogic.ashley.core.ComponentMapper;
import com.mygdx.game.mvctutorial.model.components.*;

public final class Mappers
{
	public static ComponentMapper<AccumulatorComponent> accumulatorMap = ComponentMapper.getFor(AccumulatorComponent.class);
	public static ComponentMapper<BlueSquareComponent> blueSquareMap = ComponentMapper.getFor(BlueSquareComponent.class);
	public static ComponentMapper<BodyComponent> bodyMap = ComponentMapper.getFor(BodyComponent.class);
	public static ComponentMapper<DebugRenderComponent> debugRenderMap = ComponentMapper.getFor(DebugRenderComponent.class);
	public static ComponentMapper<GameSettingsComponent> gameSettingsMap = ComponentMapper.getFor(GameSettingsComponent.class);
	public static ComponentMapper<LinearInpulseComponent> linearImpulseMap = ComponentMapper.getFor(LinearInpulseComponent.class);
	public static ComponentMapper<SizeComponent> sizeMap = ComponentMapper.getFor(SizeComponent.class);
	public static ComponentMapper<StageComponent> stageMap = ComponentMapper.getFor(StageComponent.class);
	public static ComponentMapper<TextureComponent> textureMap = ComponentMapper.getFor(TextureComponent.class);
	public static ComponentMapper<VelocityComponent> velocityMap = ComponentMapper.getFor(VelocityComponent.class);
	public static ComponentMapper<ViewportResizeComponent> viewportResizeMap = ComponentMapper.getFor(ViewportResizeComponent.class);
	public static ComponentMapper<WorldComponent> worldMap = ComponentMapper.getFor(WorldComponent.class);
}
