package thuchanh.CF2_atm_state;

public interface ATMState {
    public void withdraw(ATMMachine context, int amount);
}
