package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSecondBallTenthStrike implements LaneScoreCase {
    @Override
    /**
     * this represents a tenth frame second ball with a tenth frame strike
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        scoreBoard.setState(new TenthFrameEnd());
    }
}
