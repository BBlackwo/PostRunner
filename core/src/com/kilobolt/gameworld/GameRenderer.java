package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.kilobolt.zombiebird.ZBC;

/**
 * Created by Benjamin on 14/04/2015.
 * This class renders the game objects
 */
public class GameRenderer {
    // Variables
    private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    public GameRenderer(GameWorld world) {
        this.myWorld = world;

        cam = new OrthographicCamera();
        cam.setToOrtho(true, ZBC.GAME_WIDTH, ZBC.GAME_HEIGHT);

        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render() {
        Gdx.app.log("GameRenderer", "Render");

        /*
         * 1. We draw a black background. This prevents flickering
         */
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        /*
         * 2. We draw the filled rectangle
         */
        // Tells the shapeRenderer to begin drawing filled shapes
        shapeRenderer.begin(ShapeType.Filled);

        // Chooses RGB color of 87, 109, 120, at full opacity
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0F, 120 / 255.0f, 1);

        // Draws the rectangle from myWorld
        //shapeRenderer.rect(myWorld.getRect().x, myWorld.getRect().y, myWorld.getRect().width, myWorld.getRect().height);

        // Tells the shapeRenderer to finish rendering
        /** We MUST do this every time **/
        shapeRenderer.end();

        /*
         * We draw the rectangle's outline
         */
        // Tells shapeRenderer to draw an outline of the following shapes
        shapeRenderer.begin(ShapeType.Line);

        // Chooses RGB color of 255,109,120 at full opacity
        shapeRenderer.setColor(255 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        // Draws the rectangle from myWorld (Using ShapeType.Line)
        //shapeRenderer.rect(myWorld.getRect().x, myWorld.getRect().y,
        // myWorld.getRect().width, myWorld.getRect().height);

        shapeRenderer.end();
    }
}
