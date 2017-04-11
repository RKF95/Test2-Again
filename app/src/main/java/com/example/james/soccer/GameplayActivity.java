package com.example.james.soccer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

public class GameplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
    }
  //  Striker st = new Striker("Air", "Bud", "RS", new int[]{26, 99, 99, 99, 99, 99, 99, 99, 99, 0, 1});
    //Goalie gk = new Goalie("Manuel","Neuer", new int[]{76,93,84,80,68,78,80,64,80,93,2});

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                createMove();
            case MotionEvent.ACTION_MOVE:
                createPass();
            case MotionEvent.ACTION_UP:
        }
        return false;
    }

    public void createPass(){

    }

    public void createMove(){

    }


}
