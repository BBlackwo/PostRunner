package com.kilobolt.zbHelpers;

import com.badlogic.gdx.InputProcessor;
import com.kilobolt.gameobjects.Bird;

/**
 * Created by Benjamin on 15/04/2015.
 * Handles inputs for the project.
 * InputProcessor is an interface between platform-dependent code and our code
 */
public class InputHandler implements InputProcessor {
    // Variables
    private Bird myBird;

    public InputHandler(Bird myBird) {
        this.myBird = myBird;
    }

    // Calls our bird's onclick method
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        myBird.onClick();
        return false;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

}
