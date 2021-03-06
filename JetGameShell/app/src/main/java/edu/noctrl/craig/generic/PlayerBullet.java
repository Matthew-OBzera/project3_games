package edu.noctrl.craig.generic;

import android.graphics.Rect;

public class PlayerBullet extends Bullet {

    private final Rect rect = new Rect(118,310,182,370);
    Stage stage;
    public PlayerBullet(Stage stage) {
        super(stage);
        damage = 20;
        this.penetration = 1;
        this.collidesWith = Collision.SolidAI;
        this.substance = Collision.SolidPlayer;
        this.speed = 600;
        this.stage = stage;
    }


    @Override
    public Rect getSource() {
        return rect;
    }

    @Override
    public Point3F getScale() {
        return new Point3F(.5f,.5f,1);
    }

    @Override
    public void cull() {

    }
}
