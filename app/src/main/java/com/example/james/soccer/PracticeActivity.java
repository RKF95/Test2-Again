package com.example.james.soccer;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class PracticeActivity extends AppCompatActivity {
    ImageView airbud, trump, ball_image;
    RelativeLayout myLayout;
    Button shoot;
    private int deltaX;
    private int deltaY;
    Striker user = new Striker("Air","Bud","LST",new int[]{26, 99, 99, 99, 99, 99, 99, 99, 99, 0, 1});
    Goalie goalie = new Goalie("Donald", "Trump", new int[]{70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12});


    private float xCoOrdinate, yCoOrdinate;


    RelativeLayout.LayoutParams parms;
    float dx=0,dy=0,x=0,y=0;

    Ball ball;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        myLayout = (RelativeLayout)findViewById(R.id.layout);
        airbud = (ImageView)findViewById(R.id.airbud);
        trump = (ImageView)findViewById(R.id.trump);
        shoot = (Button)findViewById(R.id.shoot);
        ball_image = (ImageView)findViewById(R.id.ball);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(200, 100);
        user.setLocation(new Point((int)airbud.getX(), (int)airbud.getY()));
        ball = new Ball(new Point((int)ball_image.getX(), (int)ball_image.getY()));


        airbud.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        xCoOrdinate = view.getX() - event.getRawX();
                        yCoOrdinate = view.getY() - event.getRawY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        view.animate().x(event.getRawX() + xCoOrdinate).y(event.getRawY() + yCoOrdinate).setDuration(0).start();
                        ball_image.animate().x(event.getRawX() + xCoOrdinate).y(event.getRawY() + yCoOrdinate + 60).setDuration(0).start();
                        break;
                    default:
                        return false;
                }


                return true;
            }
        });






    }

    @Override
    protected void onStart() {
        super.onStart();
        myTimer timer = new myTimer(99999999, Constants.FIRST_HALF, user, goalie, ball, myLayout );
    }

  /*  public boolean onTouch(ImageView view, MotionEvent event){
        final int X = (int) event.getRawX();
        final int Y = (int) event.getRawY();
        user.setGoal(new Point(X,Y));
        return true;
    }*/


    public boolean onTouch1(ImageView view, MotionEvent event) {
        boolean tf = false;



        return tf;
    }

    public void shoot(View view) {
        ball_image.animate().x(trump.getX()).y(trump.getY()-10).setDuration(500).start();
    }
}
