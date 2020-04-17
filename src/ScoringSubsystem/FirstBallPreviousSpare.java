package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBallPreviousSpare extends LaneScoreCase {
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int currScore = scoreCard.get(currBowler)[frame][0];
        numericScores.get(currBowler)[frame-1]=10+currScore;
        if(currScore == 10){
            scoreboard.setState(new FirstBallPreviousStrike());
        } else {
            scoreboard.setState(new SecondBall());
        }
    }
}
