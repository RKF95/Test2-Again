package com.example.james.soccer;

import android.graphics.Bitmap;

/**
 * Created by james on 3/7/2017.
 */

public class Midfielder extends Player {
    public Midfielder(String fname, String lname, String position, int[] numbers, Bitmap bmp) {
        super(fname, lname, position, numbers, bmp);
    }

    @Override
    public void setZone(int SIDE_OF_FIELD) {

    }

    @Override
    public void defend(Ball ball) {

    }

    @Override
    public void attack(Ball ball) {

    }
}
