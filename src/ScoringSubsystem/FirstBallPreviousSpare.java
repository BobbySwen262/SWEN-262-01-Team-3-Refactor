package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBallPreviousSpare extends LaneScoreCase {
    public FirstBallPreviousSpare(){}
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int currScore = scoreCard.get(currBowler)[frame][0];

        if(frame < 10){
            if (currScore == 10){
                scoreboard.setState(new TenthFrameSecondStrike());
            }
            else{
                scoreboard.setState(new TenthFrameSecondBallNinthNoStrike());
            }
        }
        else{
            if (currScore == 10){
                scoreboard.setState(new FirstBallPreviousStrike());
            }
            else{
                scoreboard.setState(new SecondBall());
            }
        }

    }
}
