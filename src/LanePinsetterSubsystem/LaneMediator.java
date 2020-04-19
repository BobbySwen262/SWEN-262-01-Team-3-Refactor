package LanePinsetterSubsystem;

import java.util.ArrayList;

public class LaneMediator implements LaneManager{
    /** Collections of all LaneElements */
    private ArrayList<Lane> lanes = new ArrayList<>();
    private ArrayList<Pinsetter> pinsetters = new ArrayList<>();
    private ArrayList<LaneStatusView> laneStatusViews = new ArrayList<>();
    private ArrayList<LaneView> laneViews = new ArrayList<>();
    private ArrayList<PinSetterView> pinSetterViews = new ArrayList<>();

    public LaneMediator() {

    }

    /** Subscribe methods */
    public void addLane(Lane lane){
        lanes.add(lane);
    }
    public void addPinsetter(Pinsetter pinsetter){
        pinsetters.add(pinsetter);
    }
    public void addLaneStatusView(LaneStatusView laneStatusView){
        laneStatusViews.add(laneStatusView);
    }
    public void addLaneView(LaneView laneView){
        laneViews.add(laneView);
    }
    public void addPinsetterView(PinSetterView pinSetterView){
        pinSetterViews.add(pinSetterView);
    }

    /** Updates all 'lane listeners' of a lane event */
    @Override
    public synchronized void receiveLaneEvent(LaneEvent le) {
        Lane lane = le.getLane();
        int id = lanes.indexOf(lane);
        if (id!=-1) {
            laneViews.get(id).receiveLaneEvent(le);
            laneStatusViews.get(id).receiveLaneEvent(le);
        }
    }

    /** Updates all 'pinsetter listeners' of a pinsetter event */
    public synchronized void receivePinsetterEvent(PinsetterEvent pe){
        Pinsetter pinsetter = pe.getPinsetter();
        int id = pinsetters.indexOf(pinsetter);
        if (id!=-1) {
            pinSetterViews.get(id).receivePinsetterEvent(pe);
            laneStatusViews.get(id).receivePinsetterEvent(pe);
            lanes.get(id).receivePinsetterEvent(pe);
        }
    }
}
