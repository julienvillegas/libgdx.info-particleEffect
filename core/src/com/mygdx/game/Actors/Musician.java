package com.mygdx.game.Actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.MyGdxGame;

/**
 * Created by julienvillegas on 31/01/2017.
 */

public class Musician extends Image {

    ParticleEffect effect;
    public Musician(){
        super(new Texture("musician.png"));
        effect = new ParticleEffect();
        effect.load(Gdx.files.internal("musician.p"),MyGdxGame.textureAtlas);
        effect.start();
        effect.setPosition(this.getWidth()+this.getX(),this.getHeight()+this.getY());
    }



    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        effect.draw(batch);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        effect.update(delta);
    }

    @Override
    public void setX(float x) {
        super.setX(x);
        effect.setPosition(this.getWidth()+this.getX(),this.getHeight()+this.getY());

    }


}
