package com.kilobolt.zombiebird.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kilobolt.zombiebird.ZBC;
import com.kilobolt.zombiebird.ZBGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Post Rider";
		config.width = ZBC.GAME_WIDTH*2;
		config.height = ZBC.GAME_HEIGHT*2;
		new LwjglApplication(new ZBGame(), config);
	}
}
