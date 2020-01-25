package com.mygdx.flappycat.components;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.flappycat.SoundManager;
import com.mygdx.flappycat.TextureManager;
import com.mygdx.flappycat.flappyCat;

public class Cat {

    private Texture texture = TextureManager.CAT;
    private static final int positionX = 180;
    private int positionY = (460 + 720 - texture.getWidth());
    private boolean flap = false;
    private int frameCount = 0;
    private int flapDistance;
    private int gravityRate;

    public Cat(int flapDistance, int gravityRate) {
        this.flapDistance = flapDistance;
        this.gravityRate = gravityRate;
    }

    public void render(SpriteBatch sb, boolean playing, boolean splash) {
        Sprite lilbSprite = new Sprite(texture);
        lilbSprite.setPosition(positionX, positionY);

        // Flap position
        if(playing && flap) {
            lilbSprite.setRotation(lilbSprite.getRotation() + 25);
            lilbSprite.draw(sb);
            frameCount++;
            if(frameCount == 60) {
                flap = false;
                frameCount = 0;
            }
        }

        // Normal Position
        if(playing && !flap)
            sb.draw(texture, positionX, positionY);

        // Falling Position
        if(!playing && !splash) {
            lilbSprite.setRotation(lilbSprite.getRotation() + 90);
            lilbSprite.draw(sb);
        }
    }

    public void pullDown() {
        if(positionY >= 460 || positionY-gravityRate >= 460)
            positionY -= gravityRate;
    }

    public void flap() {
        SoundManager.FLAP.play();
        if(positionY+texture.getHeight()+flapDistance > flappyCat.HEIGHT)
            positionY += flappyCat.HEIGHT-(positionY+texture.getHeight());
        else if(positionY+texture.getHeight() <= flappyCat.HEIGHT)
            positionY += flapDistance;
        flap = true;
    }

    public int getPositionX(int x) {
        if(x == 1)
            return positionX;
        if(x == 2)
            return positionX+texture.getWidth();
        return 0;
    }

    public int getPositionY(int x) {
        if(x == 1)
            return positionY;
        if(x == 2)
            return positionY+texture.getHeight();
        return 0;
    }

    public Rectangle getBounds() {
        return new Rectangle(positionX, positionY, texture.getWidth(), texture.getHeight());
    }
}