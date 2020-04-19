package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameStrikeNinthStrike implements LaneScoreCase{
    @Override
    /**
     * this represents a tenth frame strike with a ninth frame strike
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int currScore = scoreCard.get(currBowler)[frame][1];
        numericScores.get(currBowler)[8] = numericScores.get(currBowler)[8] + 20+currScore;
        if(currScore == 10){
            scoreBoard.setState(new TenthFrameSecondStrike());
        } else {
            scoreBoard.setState(new TenthFrameSecondBallTenthStrike());
        }
    }
}
