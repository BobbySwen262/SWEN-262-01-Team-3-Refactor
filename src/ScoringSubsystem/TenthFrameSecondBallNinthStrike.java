package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSecondBallNinthStrike implements LaneScoreCase {
    @Override
    /**
     * This represents a tenth frame second ball with a strike in the ninth frame
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int pinsDownSecondBall = scoreCard.get(currBowler)[frame][1];
        int pinsDownFirstBall = scoreCard.get(currBowler)[frame][0];
        numericScores.get(currBowler)[frame-1] = numericScores.get(currBowler)[frame-2]+10 + pinsDownFirstBall + pinsDownSecondBall;
        if(pinsDownSecondBall + pinsDownFirstBall == 10){
            scoreBoard.setState(new TenthFrameSpare());
        } else {
            scoreBoard.setState(new TenthFrameEnd());
        }
    }
}
