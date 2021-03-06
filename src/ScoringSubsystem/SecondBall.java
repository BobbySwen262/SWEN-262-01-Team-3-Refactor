package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class SecondBall implements LaneScoreCase{
    @Override
    /**
     * This represents a second ball in the frame with no strike in the previous frame
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int pinsDownSecondBall = scoreCard.get(currBowler)[frame][1];
        int pinsDownFirstBall = scoreCard.get(currBowler)[frame][0];
        if(pinsDownFirstBall + pinsDownSecondBall == 10){
            scoreBoard.setState(new FirstBallPreviousSpare());
        } else {
            if(frame > 0 ) {
                numericScores.get(currBowler)[frame] = numericScores.get(currBowler)[frame - 1] + pinsDownFirstBall + pinsDownSecondBall;
            } else {
                numericScores.get(currBowler)[frame] = pinsDownFirstBall + pinsDownSecondBall;
            }
            scoreBoard.setState(new FirstBall());
        }
    }
}
