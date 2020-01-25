package com.mygdx.flappycat.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.flappycat.TextureManager;
import com.mygdx.flappycat.camera.OrthoCamera;
import com.mygdx.flappycat.flappyCat;

public class MenuScreen extends Screen {

    private OrthoCamera camera;

    @Override
    public void create() {
        camera = new OrthoCamera();
    }

    @Override
    public void update() {
        camera.update();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(camera.combined);
        sb.begin();
        sb.draw(TextureManager.BG, 0, 0);
        sb.draw(TextureManager.MENU,
                flappyCat.WIDTH / 2 - TextureManager.MENU.getWidth() / 2,
                flappyCat.HEIGHT / 2 - TextureManager.MENU.getHeight() / 2);
        sb.end();

        // Open Game
        if(Gdx.input.justTouched()) {
            ScreenManager.setScreen(new GameScreen());
        }
    }

    @Override
    public void resize(int width, int height) {
        camera.resize();
    }

    @Override
    public void dispose() {
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

}