package com.bblackwo.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.bblackwo.postrunner.PRC;

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
        rect.y++;
        if (rect.x > PRC.GAME_WIDTH+1) {
            rect.x = 0;
        }
//        if (rect.y > PRC.GAME_HEIGHT+1) {
//            rect.y = 0;
//        }
    }

    public Rectangle getRect() {
        return rect;
    }
}
