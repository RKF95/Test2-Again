package com.example.james.soccer;

import android.graphics.Canvas;

/**
 * Created by james on 4/10/2017.
 */
public class GameThread extends Thread{

    private GameView view;
    private boolean running = false;

    public GameThread(GameView view){
        this.view = view;
    }

    public void setRunning(boolean running){
        this.running = running;
    }

    @Override
    public void run(){
        while(running){
            Canvas c = null;
            try{
                c = view.getHolder().lockCanvas();
                synchronized (view.getHolder()){
                    view.draw(c);
                }
            } finally {
                if(c!=null){
                    view.getHolder().unlockCanvasAndPost(c);
                }
            }
        }
    }
}
