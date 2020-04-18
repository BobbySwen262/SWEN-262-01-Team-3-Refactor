package ScoringSubsystem;

import LanePinsetterSubsystem.Bowler;

import java.util.HashMap;

public class TenthFrameEnd extends LaneScoreCase{
    @Override
    void score(HashMap<Bowler, int[][]> scoreCard, HashMap<Bowler, int[]> numericScores, Bowler currBowler, int frame) {
        int[] tenthFramePins = scoreCard.get(currBowler)[9];
        int score = 0;
        if(tenthFramePins[0]==10){
            if(tenthFramePins[1]==10){
                score = 30+3*tenthFramePins[2];
            } else {
                score = 10+2*(tenthFramePins[1]+tenthFramePins[2]);
            }
        } else {
            if(tenthFramePins[0]+tenthFramePins[1]==10){
                score = 10 + 2*(tenthFramePins[2]);
            } else {
                score = tenthFramePins[0]+tenthFramePins[1];
            }
        }
        numericScores.get(currBowler)[9] = score;
    }
}
