package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameSpare extends LaneScoreCase{

    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int currScore = scoreCard.get(currBowler)[frame][2];
        if (currScore == 10){
            scoreBoard.setState(new TenthFrameEnd());
        }else{
            scoreBoard.setState(new TenthFrameEnd());
        }
    }
}
