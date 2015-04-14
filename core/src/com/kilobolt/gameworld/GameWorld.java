package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;
import com.kilobolt.gameobjects.Bird;

/**
 * Created by Benjamin on 14/04/2015.
 * This class updates the game objects
 */
public class GameWorld {
    // Variables
    private Bird bird;

    public GameWorld(int midPointY) {
        //Initialise Bird to be 5 pixels above the vertical middle of the screen.
        bird = new Bird(33, midPointY -5, 17, 12);
    }

    public void update(float delta) {
        Gdx.app.log("GameWorld", "Update");
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;
    }
}
