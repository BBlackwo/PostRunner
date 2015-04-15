package com.kilobolt.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.kilobolt.gameworld.GameRenderer;
import com.kilobolt.gameworld.GameWorld;
import com.kilobolt.zbHelpers.InputHandler;
import com.kilobolt.zombiebird.ZBC;

/**
 * Created by Benjamin on 13/04/2015.
 */
public class GameScreen implements Screen {

    // Variables
    private GameWorld world;
    private GameRenderer renderer;

    private float runTime = 0;

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");

        // Get size information
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = ZBC.GAME_WIDTH;
        float gameHeight = screenHeight / (screenWidth / gameWidth); // scale to same factor as width

        int midPointY = (int) (gameHeight /2);

        // Initialize objects
        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world, (int) gameHeight, midPointY);

        // Set up InputProcessor
        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
    }

    // Essentially our game loop. Firstly, we will update all our game objects. Secondly, we will render those game objects.
    @Override
    public void render(float delta) {
        // Covert Frame rate to String, print it
        Gdx.app.log("GameScreen FPS", (1/delta) + "");

        // Increment runTime by Delta
        runTime += delta;

        // Helper Objects
        world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "Resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen","Show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen","Hide called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen","Pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen","Resume called");
    }

    @Override
    public void dispose() {

    }
}
