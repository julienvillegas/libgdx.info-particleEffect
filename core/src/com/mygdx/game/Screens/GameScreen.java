package com.mygdx.game.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.Actors.MusicalNote;
import com.mygdx.game.Actors.Musician;

/**
 * Created by julienvillegas on 17/01/2017.
 */
public class GameScreen implements Screen {

    private Stage stage;
    private Game game;


    public GameScreen(Game aGame) {
        game = aGame;
        stage = new Stage(new ScreenViewport());

        Musician musician = new Musician();
        musician.setX(Gdx.graphics.getWidth()/12);
        stage.addActor(musician);


        MusicalNote musicalNote = new MusicalNote();
        musicalNote.setPosition(Gdx.graphics.getWidth()*3/5,Gdx.graphics.getHeight()*1/5);
        musicalNote.addAction(Actions.repeat(-1,Actions.sequence(Actions.moveTo(Gdx.graphics.getWidth()*3/5,Gdx.graphics.getHeight()*3/5,2, Interpolation.sine),Actions.moveTo(Gdx.graphics.getWidth()*3/5,Gdx.graphics.getHeight()*1/5,2, Interpolation.sine))));
        stage.addActor(musicalNote);


    }

    @Override
    public void show() {
        Gdx.app.log("MainScreen","show");

    }

    @Override
    public void render(float delta) {
        //jave 8

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }




    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        stage.dispose();
    }


}
