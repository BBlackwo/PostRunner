package com.bblackwo.postrunner.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bblackwo.postrunner.PRC;
import com.bblackwo.postrunner.PRGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Post Rider";
		config.width = PRC.GAME_WIDTH*2;
		config.height = PRC.GAME_HEIGHT*2;
		new LwjglApplication(new PRGame(), config);
	}
}
