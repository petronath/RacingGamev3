package com.racing.game3.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.racing.game3.RacingGamev3;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new RacingGamev3(), config);
		config.forceExit = false;
		config.height = 1000;
		config.width = 1600;
		//config.resizable = false;
	}
}
