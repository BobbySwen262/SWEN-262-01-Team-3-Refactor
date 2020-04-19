package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBallPreviousSpare implements LaneScoreCase {
    public FirstBallPreviousSpare(){}
    @Override
    /**
     * This represents the state for a first ball with a spare in the frame before it
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int currScore = scoreCard.get(currBowler)[frame][0];
        if(frame > 1) {
            numericScores.get(currBowler)[frame - 1] = numericScores.get(currBowler)[frame - 2] + 10 + currScore;
        } else {
            numericScores.get(currBowler)[frame - 1] = 10 + currScore;
        }
        if(frame >= 9)
        {
            if (currScore == 10){
                scoreBoard.setState(new TenthFrameStrikeNinthNoStrike());
            }
            else{
                scoreBoard.setState(new TenthFrameSecondBallNinthNoStrike());
            }
        }
        else{
            if (currScore == 10){
                scoreBoard.setState(new FirstBallPreviousStrike());
            }
            else{
                scoreBoard.setState(new SecondBall());
            }
        }
    }
}
