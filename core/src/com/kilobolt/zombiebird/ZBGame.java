package com.kilobolt.zombiebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.kilobolt.screens.GameScreen;

public class ZBGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("PRGAME", "Created");
		setScreen(new GameScreen());
	}
}
