package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSpare extends LaneScoreCase{

    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int currScore = scoreCard.get(currBowler)[frame][1];
        if (currScore == 10){
            scoreboard.setState(new TenthFrameEnd());
        }else{
            scoreboard.setState(new TenthFrameEnd());
        }
    }
}
