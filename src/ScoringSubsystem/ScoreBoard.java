package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class ScoreBoard {

    public LaneScoreCase state;
    public ScoreBoard(){
        state = new FirstBall();
    }

    public void setState(LaneScoreCase state){
        this.state = state;
    }

    public void runState(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard){
        state.score(scoreCard, numericScores, currBowler, frame, scoreBoard);
    }

}
