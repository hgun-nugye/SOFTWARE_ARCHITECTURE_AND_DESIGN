package thuchanh.CF2_atm_state;

public class OutOfMoneyState implements ATMState {
    @Override
    public void withdraw(ATMMachine context, int amount) {
        System.out.println("Khong the rut tien. May ATM da het tien.");
    }
}
