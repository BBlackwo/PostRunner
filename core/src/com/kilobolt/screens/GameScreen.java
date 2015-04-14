package com.kilobolt.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.kilobolt.gameworld.GameRenderer;
import com.kilobolt.gameworld.GameWorld;

/**
 * Created by Benjamin on 13/04/2015.
 */
public class GameScreen implements Screen {

    // Variables
    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");

        // Get size information
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth); // scale to same factor as width

        int midPointY = (int) (gameHeight /2);

        // Initialize objects
        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world);
    }

    // Essentially our game loop. Firstly, we will update all our game objects. Secondly, we will render those game objects.
    @Override
    public void render(float delta) {
        // Sets a color to fill the screen with (RGB = 10, 15, 230), Opacity of 1 (100%)
        Gdx.gl.glClearColor(10/255.0f, 15/255.0f, 230 / 255.0f, 1f);
        // Fills the screen with the selected color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        // Covert Frame rate to String, print it
        Gdx.app.log("GameScreen FPS", (1/delta) + "");

        // Helper Objects
        world.update(delta);
        renderer.render();
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
