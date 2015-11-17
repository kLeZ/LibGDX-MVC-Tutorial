package com.mygdx.game.mvctutorial.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.mvctutorial.MvcGame;

public class DesktopLauncher
{
	public static void main(String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1024;
		config.height = 768;
		new LwjglApplication(new MvcGame(config.width, config.height), config);
	}
}
