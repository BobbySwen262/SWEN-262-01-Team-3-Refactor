package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBallPreviousDoubleStrike extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int currScore = scoreCard.get(currBowler)[frame][0];
        if(frame > 2) {
            numericScores.get(currBowler)[frame - 2] = numericScores.get(currBowler)[frame - 3]+20 + currScore;
        } else {
            numericScores.get(currBowler)[frame - 2] = 20 + currScore;
        }
        if(frame >= 9){
            if(currScore == 10){
                scoreBoard.setState(new TenthFrameStrikeNinthStrike());
            } else {
                scoreBoard.setState(new TenthFrameStrikeNinthStrike());
            }
        } else {
            if(currScore < 10){
                scoreBoard.setState(new SecondBallPreviousStrike());
            }
        }
    }
}
