package LanePinsetterSubsystem;

import java.util.ArrayList;

public class LaneMediator implements LaneManager{
    private ArrayList<Lane> lanes = new ArrayList<>();
    private ArrayList<Pinsetter> pinsetters = new ArrayList<>();
    private ArrayList<LaneStatusView> laneStatusViews = new ArrayList<>();
    private ArrayList<LaneView> laneViews = new ArrayList<>();
    private ArrayList<PinSetterView> pinSetterViews = new ArrayList<>();

    public LaneMediator() {

    }

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

    @Override
    public synchronized void receiveLaneEvent(LaneEvent le) {
        Lane lane = le.getLane();
        int id = lanes.indexOf(lane);
        System.err.println("LID: " + id);
        if (id!=-1) {
            laneViews.get(id).receiveLaneEvent(le);
            laneStatusViews.get(id).receiveLaneEvent(le);
        }
    }

    public synchronized void receivePinsetterEvent(PinsetterEvent pe){
        Pinsetter pinsetter = pe.getPinsetter();
        int id = pinsetters.indexOf(pinsetter);
        System.err.println("PSID: " + id);
        System.out.println(pinsetter);
        System.out.println(pinsetters);
        if(pinsetters.size()>0) {
            System.err.println(pinsetter.equals(pinsetters.get(0)));
        }
        if (id!=-1) {
            pinSetterViews.get(id).receivePinsetterEvent(pe);
            laneStatusViews.get(id).receivePinsetterEvent(pe);
            lanes.get(id).receivePinsetterEvent(pe);
        }
    }

    public void printContents(){
        System.out.println(lanes.size());
        System.out.println(pinsetters.size());
        System.out.println(laneStatusViews.size());
        System.out.println(laneViews.size());
        System.out.println(pinSetterViews.size());

    }
}
