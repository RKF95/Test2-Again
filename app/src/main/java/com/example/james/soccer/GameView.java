package com.example.james.soccer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Richard Frolia on 4/7/2017.
 */

public class GameView extends SurfaceView {

    SurfaceHolder holder;
    Bitmap myBitmap;
    int x,y = 50;
    GameThread thread;
    Player airbud;

    Rect g1 = new Rect(100,405,150,455);


    Rect rd1 = new Rect(320,520,410,590);
    Rect ld2 = new Rect(1360,270,1450,340);
    Rect rd2 = new Rect(1360,520,1450,590);
    Rect m1 = new Rect(470,395,560,465);
    Rect m2 = new Rect(1210,395,1300,465);

    Rect ld1 = new Rect(320,270,410,340);
    Rect ls1 = new Rect(620,270,710,340);
    Rect rs1 = new Rect(620,520,710,590);
    Rect ls2 = new Rect(1050,270,1140,340);
    Rect rs2 = new Rect(1050,520,1140,590);


    Rect g2 = new Rect(1630,405,1680,455);




    public GameView(Context context) {
        super(context);
        //setBackground(getResources().getDrawable(R.drawable.soccerfield2));
        thread = new GameThread(this);
        myBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.shepherdrun);
        int[] numbers = {90,90,90,90,90,90,90,90,90,90,90};
        airbud = new Striker("airbud", "", "ST", numbers, myBitmap);
        airbud.setLocation(new Point(100,10));

        holder = getHolder();
        holder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                thread.setRunning(true);
                thread.start();
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
                boolean retry = true;
                thread.setRunning(false);
                while(retry){
                    try {
                        thread.join();
                        retry = false;
                    } catch(InterruptedException e){

                    }
                }
            }
        });
    }

  //  public void getX(float x)
    {
        this.x = x;
    }

 //   public void getY(float y)
    {
        this.y = y;
    }


    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Paint p = new Paint();
        p.setColor(Color.RED);
        p.setStrokeWidth(10);
        p.setStyle(Paint.Style.STROKE);
        Paint p1 = new Paint();
        p1.setColor(Color.BLUE);
        p1.setStrokeWidth(10);
        p1.setStyle(Paint.Style.STROKE);

        airbud.move();
        canvas.drawColor(Color.GREEN);
        canvas.drawBitmap(myBitmap, airbud.getLocation().x, airbud.getLocation().y, null);

        /*canvas.drawRect(g1,p);
        canvas.drawRect(rd1,p);
        canvas.drawRect(ld1,p);
        canvas.drawRect(g2,p1);
        canvas.drawRect(ld2,p1);
        canvas.drawRect(rd2,p1);
        canvas.drawRect(m1,p);
        canvas.drawRect(m2,p1);
        canvas.drawRect(rs1,p);
        canvas.drawRect(ls1,p);
        canvas.drawRect(ls2,p1);
        canvas.drawRect(rs2,p1);*/


    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = (int)event.getX()-40;
        y = (int)event.getY()-40;
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                airbud.setGoal(new Point(x,y));
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:

                break;
        }
        return true;
    }



    public void move()
    {
        ls1.set(45,45,45,45);
    }
}
