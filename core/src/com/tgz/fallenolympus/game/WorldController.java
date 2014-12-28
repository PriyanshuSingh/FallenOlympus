package com.tgz.fallenolympus.game;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.tgz.fallenolympus.entities.Player;

/**
 * Created by priyanshu on 25/12/14.
 */
public class WorldController extends InputAdapter{


    public World world;
    public Player player;

    public void init() {
        world = new World(new Vector2(0.0f, 9.81f), true);
        player = new Player(world);
    }

    public void update (float deltaTime) {
        player.update(deltaTime);
    }


}