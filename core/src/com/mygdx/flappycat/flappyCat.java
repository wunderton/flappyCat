package com.mygdx.flappycat;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.flappycat.screen.*;
import com.mygdx.flappycat.screen.MenuScreen;
import com.mygdx.flappycat.screen.ScreenManager;

public class flappyCat extends ApplicationAdapter {
	public static int WIDTH = 1080, HEIGHT = 1900;
	private SpriteBatch batch;
	private boolean fullscreen = false;

	@Override
	public void create() {
		batch = new SpriteBatch();
		ScreenManager.setScreen(new MenuScreen());
	}

	@Override
	public void dispose() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().dispose();
		batch.dispose();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().update();

		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().render(batch);
	}

	@Override
	public void resize(int width, int height) {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().resize(width, height);
	}

	@Override
	public void pause() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().pause();
	}

	@Override
	public void resume() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().resume();
	}
}