package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSecondStrike extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int currScore = scoreCard.get(currBowler)[frame][2];
        numericScores.get(currBowler)[frame - 2] = 20 + currScore;
        if (currScore >= 10){
            scoreboard.setState(new TenthFrameEnd());
        }else{
            scoreboard.setState(new TenthFrameEnd());
        }
    }
}
