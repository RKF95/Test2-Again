package com.example.james.soccer;

import android.graphics.Bitmap;
import android.graphics.Point;

/**
 * Created by james on 2/27/2017.
 */

public abstract class Player {
    private String fname, lname, position = "";
    private int overall, height, speed, shooting, passing, dribbling, defending, strength, awareness, goalkeeping, teamId, SIDE_OF_FIELD;
    private Point location, zoneCenter, goal;
    private boolean hasBall, user = false;
    private double velocity;
    private Bitmap bmp;

    public Player(String fname, String lname,String position, int[] numbers, Bitmap bmp){
        this.fname = fname;
        this.lname = lname;
        this.bmp = bmp;
        this.position = position;
        for(int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 0:
                    height = numbers[i];
                    break;
                case 1:
                    overall = numbers[i];
                    break;
                case 2:
                    speed = numbers[i];
                    break;
                case 3:
                    shooting = numbers[i];
                    break;
                case 4:
                    passing = numbers[i];
                    break;
                case 5:
                    dribbling = numbers[i];
                    break;
                case 6:
                    defending = numbers[i];
                    break;
                case 7:
                    strength = numbers[i];
                    break;
                case 8:
                    awareness = numbers[i];
                    break;
                case 9:
                    goalkeeping = numbers[i];
                    break;
                case 10:
                    teamId = numbers[i];
            }
        }
    }
    public abstract void setZone(int SIDE_OF_FIELD);
    public abstract void defend(Ball ball);
    public abstract void attack(Ball ball);

    public void pass(Ball ball, Point goal){
        if(!hasBall)
            return;
        ball.isKicked(goal, getVelocityPass(ball, goal));
        hasBall = false;
    }
    public void shoot(Ball ball, int SIDE_OF_FIELD, Point goal){
        if(!hasBall)
            return;
        double distance = ball.getDistanceFrom(goal);
        if(SIDE_OF_FIELD == Constants.RIGHT_SIDE){
            goal.set(150, goal.y);
        } else {
            goal.set(-150, goal.y);
        }
        ball.isKicked(goal, getVelocityShot(distance));
        hasBall = false;
    }
    private double getVelocityShot(double distance){
        return distance * (.3) * (shooting/100);
    }
    private double getVelocityPass(Ball ball, Point goal){
        double distance = ball.getDistanceFrom(goal);
        return distance * (.3) * (passing/100);
    }
    public void move(){
        if(goal != null) {
            int newX = (int) (location.x + ((speed / 5000.0) * ((goal.x - location.x))));
            int newY = (int) (location.y + ((speed / 5000.0) * ((goal.y - location.y))));

            setLocation(new Point(newX, newY));
        }
    }
    public void dribble(Ball ball){
        move();
        ball.setLocation(location);
    }


    public String getPosition(){
        return position;
    }
    public void setZoneCenter(Point location){
        zoneCenter = location;
    }
    public void setLocation(Point location){
        this.location = location;
    }
    public Point getGoal() {
        return goal;
    }
    public boolean hasGoal(){ return goal != null;}
    public void setGoal(Point goal) {
        this.goal = goal;
    }
    public Point getZoneCenter() {
        return zoneCenter;
    }
    public Point getLocation() {
        return location;
    }
    public String getLname() {
        return lname;
    }
    public String getFname() {
        return fname;
    }
    public boolean getHasBall(){
        return hasBall;
    }
    public void giveBall() {
        hasBall = true;
    }
    public boolean isUser(){
        return user;
    }
    public void setUser(boolean user){
        this.user = user;
    }
    public boolean isMoving(){
        return (velocity != 0);
    }

    public int getSIDE_OF_FIELD() {
        return SIDE_OF_FIELD;
    }

    public void setSIDE_OF_FIELD(int SIDE_OF_FIELD) {
        this.SIDE_OF_FIELD = SIDE_OF_FIELD;
    }

    public int getDribbling() {
        return dribbling;
    }
    public int getDefending() {
        return defending;
    }
    public int getStrength() {
        return strength;
    }
    public int getAwareness() {
        return awareness;
    }

    public int getGoalkeeping() {
        return goalkeeping;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getHeight() {
        return height;
    }

    public int getOverall() {
        return overall;
    }
}