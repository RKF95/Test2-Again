package com.example.james.soccer;

/**
 * Created by james on 3/7/2017.
 */

public class Team {
    private Defender LB, LCB, CDM, RCB, RB;
    private Midfielder LM, RM;
    private Striker LST, CAM, RST;
    private Goalie G;
    private final String dummy = "dummy";
    private int BackLine;

    public Team(int teamID, int SIDE_OF_FIELD){
        //this information will be from database
        String [] positions = {"LB","LCB","CDM","RCB","RB","LM","RM","LST","CAM","RST","G"};
        for(int i = 0; i < 11; i++){
            switch (positions[i]){
                case "LB":
                    LB = new Defender(dummy, dummy, dummy, new int[9]);
                case "LCB":
                    LCB = new Defender(dummy, dummy,dummy, new int[9]);
                case "CDM":
                    CDM = new Defender(dummy, dummy, dummy,new int[9]);
                case "RCB":
                    RCB = new Defender(dummy, dummy, dummy,new int[9]);
                case "RB":
                    RB = new Defender(dummy, dummy, dummy,new int[9]);
                case "LM":
                    LM = new Midfielder(dummy, dummy, dummy,new int[9]);
                case "RM":
                    RM = new Midfielder(dummy, dummy, dummy,new int[9]);
                case "LST":
                    LST = new Striker(dummy, dummy, dummy,new int[9]);
                case "CAM":
                    CAM = new Striker(dummy, dummy, dummy,new int[9]);
                case "RST":
                    RST = new Striker(dummy, dummy, dummy,new int[9]);
            }
        }
        if(SIDE_OF_FIELD == Constants.RIGHT_SIDE){
            initializeRight();
        } else {
            initializeLeft();
        }
    }
    private void initializeRight(){

    }
    private void initializeLeft(){

    }
    public void setZones(){

    }
    public void defend(){

    }
}
