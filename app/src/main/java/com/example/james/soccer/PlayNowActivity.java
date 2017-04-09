package com.example.james.soccer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class PlayNowActivity extends AppCompatActivity {

    float x,y;
    GameView myView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myView = new GameView(this);
        setContentView(myView);
        addTouchListener();
        myView.setBackground(getResources().getDrawable(R.drawable.soccerfield2));
    }

    private void addTouchListener(){
        myView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = event.getX();
                y = event.getY();

                myView.getX(x);
                myView.getY(y);

                myView.move();

                return false;
            }
        });
    }




}
