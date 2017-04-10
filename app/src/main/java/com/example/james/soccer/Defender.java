package com.example.james.soccer;

import android.graphics.Bitmap;
import android.graphics.Point;

/**
 * Created by james on 3/7/2017.
 */

public class Defender extends Player {
    public Defender(String fname, String lname, String position, int[] numbers, Bitmap bmp) {
        super(fname, lname, position, numbers, bmp);
    }
    @Override
    public void setZone(int SIDE_OF_FIELD){
        if(SIDE_OF_FIELD == Constants.RIGHT_SIDE){
            switch(getPosition()){
                case "RB":
                    setZoneCenter(new Point(Constants.BACK_LINE_START_RIGHT , Constants.OB_FROM_MIDDLE));
                    break;
                case "RCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_START_RIGHT , Constants.CB_FROM_MIDDLE));
                    break;
                case "CDM":
                    setZoneCenter(new Point((Constants.BACK_LINE_START_RIGHT - Constants.CDM_FROM_BACK) , Constants.CM_FROM_MIDDLE));
                    break;
                case "LCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_START_RIGHT , -Constants.CB_FROM_MIDDLE));
                    break;
                case "LB":
                    setZoneCenter(new Point(Constants.BACK_LINE_START_RIGHT , -Constants.OB_FROM_MIDDLE));
                    break;
            }
        } else {
            switch(getPosition()){
                case "RB":
                    setZoneCenter(new Point(Constants.BACK_LINE_START_LEFT , Constants.OB_FROM_MIDDLE));
                    break;
                case "RCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_START_LEFT , Constants.CB_FROM_MIDDLE));
                    break;
                case "CDM":
                    setZoneCenter(new Point((Constants.BACK_LINE_START_LEFT + Constants.CDM_FROM_BACK) , Constants.CM_FROM_MIDDLE));
                    break;
                case "LCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_START_LEFT , -Constants.CB_FROM_MIDDLE));
                    break;
                case "LB":
                    setZoneCenter(new Point(Constants.BACK_LINE_START_LEFT , -Constants.OB_FROM_MIDDLE));
                    break;
            }
        }
        setSIDE_OF_FIELD(SIDE_OF_FIELD);
    }
    @Override
    public void defend(Ball ball) {
        //only temporary, maybe a parameter
        int SIDE_OF_FIELD = getSIDE_OF_FIELD();

        if(SIDE_OF_FIELD == Constants.RIGHT_SIDE){
            switch(getPosition()){
                case "RB":
                    setZoneCenter(new Point(Constants.BACK_LINE_DEFEND_RIGHT , Constants.OB_FROM_MIDDLE));
                    break;
                case "RCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_DEFEND_RIGHT , Constants.CB_FROM_MIDDLE));
                    break;
                case "CDM":
                    setZoneCenter(new Point((Constants.BACK_LINE_DEFEND_RIGHT - Constants.CDM_FROM_BACK) , Constants.CM_FROM_MIDDLE));
                    break;
                case "LCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_DEFEND_RIGHT , -Constants.CB_FROM_MIDDLE));
                    break;
                case "LB":
                    setZoneCenter(new Point(Constants.BACK_LINE_DEFEND_RIGHT , -Constants.OB_FROM_MIDDLE));
                    break;
            }
        } else {
            switch(getPosition()){
                case "RB":
                    setZoneCenter(new Point(Constants.BACK_LINE_DEFEND_LEFT , Constants.OB_FROM_MIDDLE));
                    break;
                case "RCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_DEFEND_LEFT , Constants.CB_FROM_MIDDLE));
                    break;
                case "CDM":
                    setZoneCenter(new Point((Constants.BACK_LINE_DEFEND_LEFT + Constants.CDM_FROM_BACK) , Constants.CM_FROM_MIDDLE));
                    break;
                case "LCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_DEFEND_LEFT , -Constants.CB_FROM_MIDDLE));
                    break;
                case "LB":
                    setZoneCenter(new Point(Constants.BACK_LINE_DEFEND_LEFT , -Constants.OB_FROM_MIDDLE));
                    break;
            }
        }
        if(ball.getDistanceFrom(getZoneCenter())<=30){
           // this.move(ball.getLocation());
        } else {
           // this.move(getZoneCenter());
        }
    }

    @Override
    public void attack(Ball ball) {
        int SIDE_OF_FIELD = getSIDE_OF_FIELD();

        if(SIDE_OF_FIELD == Constants.RIGHT_SIDE){
            switch(getPosition()){
                case "RB":
                    setZoneCenter(new Point(Constants.BACK_LINE_ATTACKING_RIGHT , Constants.OB_FROM_MIDDLE));
                    break;
                case "RCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_ATTACKING_RIGHT , Constants.CB_FROM_MIDDLE));
                    break;
                case "CDM":
                    setZoneCenter(new Point((Constants.BACK_LINE_ATTACKING_RIGHT - Constants.CDM_FROM_BACK) , Constants.CM_FROM_MIDDLE));
                    break;
                case "LCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_ATTACKING_RIGHT , -Constants.CB_FROM_MIDDLE));
                    break;
                case "LB":
                    setZoneCenter(new Point(Constants.BACK_LINE_ATTACKING_RIGHT , -Constants.OB_FROM_MIDDLE));
                    break;
            }
        } else {
            switch(getPosition()){
                case "RB":
                    setZoneCenter(new Point(Constants.BACK_LINE_ATTACKING_LEFT , Constants.OB_FROM_MIDDLE));
                    break;
                case "RCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_ATTACKING_LEFT , Constants.CB_FROM_MIDDLE));
                    break;
                case "CDM":
                    setZoneCenter(new Point((Constants.BACK_LINE_ATTACKING_LEFT + Constants.CDM_FROM_BACK) , Constants.CM_FROM_MIDDLE));
                    break;
                case "LCB":
                    setZoneCenter(new Point(Constants.BACK_LINE_ATTACKING_LEFT , -Constants.CB_FROM_MIDDLE));
                    break;
                case "LB":
                    setZoneCenter(new Point(Constants.BACK_LINE_ATTACKING_LEFT , -Constants.OB_FROM_MIDDLE));
                    break;
            }
        }
        if(ball.getDistanceFrom(getZoneCenter())<=30){
          //  this.move(ball.getLocation());
        } else {
           // this.move(getZoneCenter());
        }
    }
}
