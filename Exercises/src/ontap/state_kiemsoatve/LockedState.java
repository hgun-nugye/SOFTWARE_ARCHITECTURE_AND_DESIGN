package ontap.state_kiemsoatve;

public class LockedState implements GateState{
    @Override
    public void insertCard(TurnstileGate gate) {
        System.out.println("[Insert Card] Thẻ hợp lệ. Cổng mở...");
        gate.setState(new UnlockedState());
    }

    @Override
    public void passThrough(TurnstileGate gate) {
        System.out.println("Thẻ không hợp lệ. Cổng vẫn đóng...");
    }
}
