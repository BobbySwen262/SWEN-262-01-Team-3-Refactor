package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class FirstBallPreviousStrike extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {

        int currScore = scoreCard.get(currBowler)[frame][0];

        if(frame >= 10)
        {
            if (currScore == 10){
                scoreboard.setState(new TenthFrameStrikeNinthStrike());
            }
            else{
                scoreboard.setState(new TenthFrameSecondBallNinthStrike());
            }
        }
        else{
            if (currScore == 10){
                scoreboard.setState(new FirstBallPreviousDoubleStrike());
            }
            else{
                scoreboard.setState(new SecondBallPreviousStrike());
            }
        }
    }
}
