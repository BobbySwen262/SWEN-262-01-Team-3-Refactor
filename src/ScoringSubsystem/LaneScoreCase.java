package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

abstract class LaneScoreCase {
    protected ScoreBoard scoreboard = new ScoreBoard();
    abstract void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame);
}
