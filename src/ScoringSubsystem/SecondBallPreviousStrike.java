package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class SecondBallPreviousStrike extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int pinsDownSecondBall = scoreCard.get(currBowler)[frame][1];
        int pinsDownFirstBall = scoreCard.get(currBowler)[frame][0];
        numericScores.get(currBowler)[frame-1] = 10+pinsDownFirstBall+pinsDownSecondBall;
        if(pinsDownFirstBall + pinsDownSecondBall == 10){
            scoreboard.setState(new FirstBallPreviousSpare());
        } else {
            numericScores.get(currBowler)[frame] = pinsDownFirstBall+pinsDownSecondBall;
            scoreboard.setState(new FirstBall());
        }
    }
}
