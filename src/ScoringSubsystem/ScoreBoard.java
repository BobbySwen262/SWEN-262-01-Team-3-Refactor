package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

/**
 * This class represents the client in the state pattern
 */
public class ScoreBoard {

    public LaneScoreCase state;
    public ScoreBoard(){
        state = new FirstBall();
    }

    /**
     * Sets the state
     * @param state - state to be set
     */
    public void setState(LaneScoreCase state){
        this.state = state;
    }

    /**
     * This executes the state algorithm
     */
    public void runState(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame, ScoreBoard scoreBoard){
        state.score(scoreCard, numericScores, currBowler, frame, scoreBoard);
    }

}
