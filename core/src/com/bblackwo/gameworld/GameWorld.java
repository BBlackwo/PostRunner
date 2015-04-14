package com.bblackwo.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Benjamin on 14/04/2015.
 * This class updates the game objects
 */
public class GameWorld {
    // Variables
    private Rectangle rect = new Rectangle(0,0,17,12);

    public GameWorld() {

    }

    public void update(float delta) {
        Gdx.app.log("GameWorld", "Update");
        rect.x++;
        if (rect.x > 137) {
            rect.x = 0;
        }
    }

    public Rectangle getRect() {
        return rect;
    }
}
