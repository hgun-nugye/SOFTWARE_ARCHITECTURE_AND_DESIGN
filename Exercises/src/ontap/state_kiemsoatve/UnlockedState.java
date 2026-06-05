package ontap.state_kiemsoatve;

public class UnlockedState implements GateState{
    @Override
    public void insertCard(TurnstileGate gate) {
        System.out.println("Cổng đã mở. Không cần thẻ...");
    }

    @Override
    public void passThrough(TurnstileGate gate) {
        System.out.println("[Pass Through] Bạn đã đi qua cổng. Cổng đóng lại...");
        gate.setState(new LockedState());
    }
}
