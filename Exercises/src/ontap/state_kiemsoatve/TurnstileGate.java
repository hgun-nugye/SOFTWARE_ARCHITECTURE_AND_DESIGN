package ontap.state_kiemsoatve;

public class TurnstileGate {
    private GateState state;

    public TurnstileGate() {
        this.state = new LockedState();
    }

    public GateState setState(GateState state) {
        this.state = state;
        return this.state;
    }

    public void insertCard(){
        state.insertCard(this);
    }

    public void passThrough(){
        state.passThrough(this);
    }
}
