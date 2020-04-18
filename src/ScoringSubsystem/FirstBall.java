package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBall extends LaneScoreCase{

    FirstBall(){

    }
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int currScore = scoreCard.get(currBowler)[frame][0];

        if(frame >= 10) {
            if (currScore < 10){
                scoreboard.setState(new TenthFrameSecondBallNinthNoStrike());
            } else {
                scoreboard.setState(new TenthFrameStrikeNinthNoStrike());
            }
        } else {
            if (currScore < 10) {
                scoreboard.setState(new SecondBall());
            } else {
                scoreboard.setState(new FirstBallPreviousStrike());
            }
        }
    }
}
