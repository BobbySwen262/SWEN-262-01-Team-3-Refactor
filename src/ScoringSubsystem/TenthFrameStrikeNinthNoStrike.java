package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameStrikeNinthNoStrike implements LaneScoreCase{
    @Override
    /**
     * This represents a tenth frame strike but no ninth frame strike
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int currScore = scoreCard.get(currBowler)[frame][1];

        if(currScore == 10){
            scoreBoard.setState(new TenthFrameSecondStrike());
        } else {
            scoreBoard.setState(new TenthFrameSecondBallTenthStrike());
        }
    }
}
