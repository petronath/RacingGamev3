package com.racing.game3.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.racing.game3.RacingGamev3;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new RacingGamev3(), config);
		config.forceExit = false;
		config.height = 768;
		config.width = 1366;
		//config.resizable = false;
	}
}
