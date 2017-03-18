package com.example.james.soccer;

import android.graphics.Point;

public class Ball {
    private Point location;
    private boolean possession = false;
    private Point goal = null;
    private double velocity;

    public Ball() {
        new Ball(new Point(0,0));
    }
    public Ball(Point location){
        this.location = location;
        velocity = 0;
    }
    public void isKicked(Point goal, double velocity){
        this.goal = goal;
        this.velocity = velocity;
        possession = false;
    }
    public void move(){
        if((goal.x - location.x) < 1 && (goal.y - location.y) < 1){
            location = goal;
            this.stop();
            return;
        }
        int newX = (int)(location.x + ((velocity/100)*((goal.x - location.x)/((goal.x - location.x)+(goal.y - location.y)))));
        int newY = (int)(location.y + ((velocity/100)*((goal.y - location.y)/((goal.x - location.x)+(goal.y - location.y)))));
        location.set(newX, newY);
        velocity -= velocity * (1.0/getDistanceFrom(goal));
    }

    public boolean isPossessed(){
        return possession;
    }

    public double getDistanceFrom(Point goal){
        double result = Math.pow((goal.x - location.x), 2) + Math.pow((goal.y - location.y), 2);
        return Math.sqrt(result/2);
    }
    public void takePossession(){
        possession = true;
        this.stop();
    }
    public void stop(){
        goal = null;
        velocity = 0.0;
    }
    public void setLocation(Point location){
        this.location.set(location.x, location.y);
    }
    public double getVelocity(){
        return velocity;
    }
    public Point getLocation(){
        return location;
    }
}
