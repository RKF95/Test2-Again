package com.example.james.soccer;

import android.graphics.Point;

/**
 * Created by james on 3/7/2017.
 */

public class Goalie extends Player {
    public Goalie(String fname, String lname, int[] numbers) {
        super(fname, lname, "G", numbers);
    }

    @Override
    public void setZone(int SIDE_OF_FIELD) {
        if(SIDE_OF_FIELD == Constants.RIGHT_SIDE){
            setZoneCenter(new Point(Constants.G_X, Constants.G_Y_START));
        } else {
            setZoneCenter(new Point(-Constants.G_X, Constants.G_Y_START));
        }
    }

    @Override
    public void defend(Ball ball) {
        if(ball.getLocation().y > 15){
            setLocation(new Point(getLocation().x, 15));
        } else if(ball.getLocation().y < -15){
            setLocation(new Point(getLocation().x, -15));
        } else {
            setLocation(new Point(getLocation().x, ball.getLocation().y));
        }
        if(ball.getDistanceFrom(getLocation())<=(15*(getGoalkeeping()/100))){
            this.move(ball.getLocation());
        }
    }

    @Override
    public void attack(Ball ball) {
        this.move(getZoneCenter());
    }
}
