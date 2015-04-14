package com.bblackwo.postrunner;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.bblackwo.screens.GameScreen;

public class PRGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("PRGAME", "Created");
		setScreen(new GameScreen());
	}
}
