package ontap.state_kiemsoatve;

public interface GateState {
    void insertCard(TurnstileGate gate);
    void passThrough(TurnstileGate gate);
}
