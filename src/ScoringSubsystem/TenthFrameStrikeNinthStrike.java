package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameStrikeNinthStrike extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int currScore = scoreCard.get(currBowler)[frame][1];
        numericScores.get(currBowler)[9] = 20+currScore;
        if(currScore == 10){
            scoreboard.setState(new TenthFrameSecondStrike());
        } else {
            scoreboard.setState(new TenthFrameSecondBallTenthStrike());
        }
    }
}
