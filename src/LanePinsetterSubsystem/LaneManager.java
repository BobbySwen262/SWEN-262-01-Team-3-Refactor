package LanePinsetterSubsystem;

public interface LaneManager {
    public void receiveLaneEvent(LaneEvent le);
    public void receivePinsetterEvent(PinsetterEvent pe);

    public void addLane(Lane lane);
    public void addPinsetter(Pinsetter pinsetter);
    public void addLaneStatusView(LaneStatusView laneStatusView);
    public void addLaneView(LaneView laneView);
    public void addPinsetterView(PinSetterView pinSetterView);

    public void printContents();
}
