package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSecondBallNinthNoStrike implements LaneScoreCase {
    @Override
    /**
     * this represents a second ball int the tenth frame with a ninth frame spare or number
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int pinsDownSecondThrow = scoreCard.get(currBowler)[frame][1];
        int pinsDownFirstThrow = scoreCard.get(currBowler)[frame][0];
        if (pinsDownFirstThrow+pinsDownSecondThrow >= 10){
            scoreBoard.setState(new TenthFrameSpare());
        }
        else{
            scoreBoard.setState(new TenthFrameEnd());
        }
    }
}
