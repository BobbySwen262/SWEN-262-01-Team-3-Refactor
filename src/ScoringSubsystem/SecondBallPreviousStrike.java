package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class SecondBallPreviousStrike extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int pinsDownSecondBall = scoreCard.get(currBowler)[frame][1];
        int pinsDownFirstBall = scoreCard.get(currBowler)[frame][0];
        if(frame > 1) {
            numericScores.get(currBowler)[frame - 1] = numericScores.get(currBowler)[frame - 2] + 10 + pinsDownFirstBall + pinsDownSecondBall;
        } else {
            numericScores.get(currBowler)[frame - 1] = 10 + pinsDownFirstBall + pinsDownSecondBall;
        }
        if(pinsDownFirstBall + pinsDownSecondBall == 10){
            scoreBoard.setState(new FirstBallPreviousSpare());
        } else {
            numericScores.get(currBowler)[frame] = numericScores.get(currBowler)[frame-1] + pinsDownFirstBall+pinsDownSecondBall;
            scoreBoard.setState(new FirstBall());
        }
    }
}
