package com.kilobolt.com.bblackwo.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Benjamin on 14/04/2015.
 */
public class Bird {
    // Variables. Vectors hold an x component and a y component
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation; // For handling bird rotation
    private int width;
    private int height;

    public Bird(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x,y); // where it is
        velocity = new Vector2(0,0); // speed
        acceleration = new Vector2(0, 460); // change in velocity
    }

    // Called when the GameWorld updates
    public void update(Float delta) {
        // We multiply the acceleration and velocity vectors by the delta.
        // This has a normalizing effect. Creates frame-rate independent movement.
        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.y > 200) {
            velocity.y = 200; // cap velocity at 200
        }

        position.add(velocity.cpy().scl(delta));
    }

    // Called when the screen is clicked or touched
    public void onClick() {
        velocity.y = -140;
    }

    // GETTERS
    public float getX() {
        return position.x;
    }
    public float getY() {
        return position.y;
    }
    public float getWidth() {
        return width;
    }
    public float getHeight() {
        return height;
    }
    public float getRotation() {
        return rotation;
    }
}
