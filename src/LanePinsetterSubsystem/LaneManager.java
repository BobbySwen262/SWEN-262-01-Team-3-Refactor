package LanePinsetterSubsystem;

public interface LaneManager {
    /** Mediators must handle two types of events */
    public void receiveLaneEvent(LaneEvent le);
    public void receivePinsetterEvent(PinsetterEvent pe);

    /** Subscribe operations */
    public void addLane(Lane lane);
    public void addPinsetter(Pinsetter pinsetter);
    public void addLaneStatusView(LaneStatusView laneStatusView);
    public void addLaneView(LaneView laneView);
    public void addPinsetterView(PinSetterView pinSetterView);
}
