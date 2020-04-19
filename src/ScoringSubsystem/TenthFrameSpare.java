package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSpare implements LaneScoreCase{

    @Override
    /**
     * this represents a tenth frame spare
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int currScore = scoreCard.get(currBowler)[frame][2];
        if (currScore == 10){
            scoreBoard.setState(new TenthFrameEnd());
        }else{
            scoreBoard.setState(new TenthFrameEnd());
        }
    }
}
