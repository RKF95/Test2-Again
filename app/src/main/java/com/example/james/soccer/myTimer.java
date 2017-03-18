package com.example.james.soccer;

import android.media.Image;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by james on 3/13/2017.
 */

public class myTimer extends CountDownTimer {
    private int INDICATOR;
    private Player striker, goalie;
    private Ball ball;
    private ImageView striker_image, goalie_image, ball_image;

    public myTimer(int secsInFuture, int INDICATOR, Player striker, Player goalie, Ball ball, RelativeLayout layout) {
        super(secsInFuture*1000, 500);
        this.INDICATOR = INDICATOR;
        this.striker = striker;
        this.goalie = goalie;
        striker_image = (ImageView) layout.findViewById(R.id.airbud);
        goalie_image = (ImageView) layout.findViewById(R.id.trump);
    }

    @Override
    public void onTick(long millisUntilFinished) {
        if(striker.hasGoal()){
            striker.move(striker.getGoal());
        }
        if(goalie.hasGoal()){
            goalie.move(goalie.getGoal());
        }
        striker_image.setX(striker.getLocation().x);
        striker_image.setY(striker.getLocation().y);
        goalie_image.setX(goalie.getLocation().x);
        goalie_image.setY(goalie.getLocation().y);
        ball_image.setX(ball.getLocation().x);
        ball_image.setY(ball.getLocation().y);
    }

    @Override
    public void onFinish() {
        if(INDICATOR == Constants.SECOND_HALF){
            INDICATOR = Constants.DONE;
        } else {
            INDICATOR = Constants.SECOND_HALF;
        }
    }
    public int getIndicator(){
        return INDICATOR;

    }
}
