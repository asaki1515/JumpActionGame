package jp.techacademy.asaki.minegishi.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Enemy extends Sprite {
    // 横幅、高さ
    public static final float ENEMY_WIDTH = 1.2f;
    public static final float ENEMY_HEIGHT = 1.2f;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
    }

}