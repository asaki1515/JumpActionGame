package jp.techacademy.asaki.minegishi.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

public class Enemy extends GameObject {
    // 横幅、高さ
    public static final float ENEMY_WIDTH = 1.2f;
    public static final float ENEMY_HEIGHT = 1.2f;

    // 速度
    public static final float STEP_VELOCITY = 3.0f;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
        velocity.x = STEP_VELOCITY;
    }

    // 座標を更新する
    public void update(float deltaTime) {
            setX(getX() + velocity.x * deltaTime);

            if (getX() < ENEMY_WIDTH / 2) {
                velocity.x = -velocity.x;
                setX(ENEMY_WIDTH / 2);
            }
            if (getX() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2) {
                velocity.x = -velocity.x;
                setX(GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2);
            }

    }

}