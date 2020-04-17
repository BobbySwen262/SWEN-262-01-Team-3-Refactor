package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBall extends LaneScoreCase{

    FirstBall(){

    }
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int currScore = scoreCard.get(currBowler)[frame][0];

        if ( currScore < 10 ){
            scoreCard.get(currBowler)[frame][0] = currScore;
            scoreboard.setState(new SecondBall());
        }else{
            scoreCard.get(currBowler)[frame][0] = 10;
            scoreCard.get(currBowler)[frame][1] = 0;
            scoreCard.get(currBowler)[frame][2] = 0;
            scoreboard.setState(new FirstBallPreviousStrike());
        }
    }
}
