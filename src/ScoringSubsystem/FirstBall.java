package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBall implements LaneScoreCase{
    FirstBall(){

    }
    @Override
    /**
     * Represents the first ball thrown with no strike or spare before the frame
     */
    public void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard) {
        int currScore = scoreCard.get(currBowler)[frame][0];

        if(frame >= 9) {
            if (currScore < 10){
                scoreBoard.setState(new TenthFrameSecondBallNinthNoStrike());
            } else {
                scoreBoard.setState(new TenthFrameStrikeNinthNoStrike());
            }
        } else {
            if (currScore < 10) {
                scoreBoard.setState(new SecondBall());
            } else {
                scoreBoard.setState(new FirstBallPreviousStrike());
            }
        }
    }
}
