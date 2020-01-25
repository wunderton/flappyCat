package com.mygdx.flappycat;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class SoundManager {

    public static Sound WOOSH = Gdx.audio.newSound(Gdx.files.internal("woosh.ogg"));
    public static Sound FLAP = Gdx.audio.newSound(Gdx.files.internal("flap.ogg"));
    public static Sound HIT = Gdx.audio.newSound(Gdx.files.internal("hit.mp3"));
    public static Sound FALL = Gdx.audio.newSound(Gdx.files.internal("fall.ogg"));
    public static Sound POINT = Gdx.audio.newSound(Gdx.files.internal("point.ogg"));

}
