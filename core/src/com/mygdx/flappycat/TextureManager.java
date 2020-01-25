package com.mygdx.flappycat;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class TextureManager {

    public static Texture BG =          new Texture(Gdx.files.internal("bg.png"));
    public static Texture MENU =        new Texture(Gdx.files.internal("logo.png"));
    public static Texture GET_READY =   new Texture(Gdx.files.internal("ready.png"));
    public static Texture BG_GROUND =   new Texture(Gdx.files.internal("bg_ground.png"));
    public static Texture CAT =         new Texture(Gdx.files.internal("cat.png"));
    public static Texture PIPE_UP =     new Texture(Gdx.files.internal("pipe_up.png"));
    public static Texture PIPE_DOWN =   new Texture(Gdx.files.internal("pipe_down.png"));
    public static Texture GAME_OVER =   new Texture(Gdx.files.internal("game_over.png"));
    public static Texture REPLAY =      new Texture(Gdx.files.internal("replay.png"));

}