package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSecondStrike implements LaneScoreCase{
    @Override
    /**
     * this represents a double strike in the tenth frame
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        scoreBoard.setState(new TenthFrameEnd());
    }
}
