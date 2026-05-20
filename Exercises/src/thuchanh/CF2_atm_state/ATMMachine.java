package thuchanh.CF2_atm_state;

public class ATMMachine {
    private final int MAX_WITHDRAWAL = 50_000_000;
    private ATMState currentState;
    private int cashInMachine;

    public ATMMachine(int initialCash) {
        this.cashInMachine = initialCash;
        if (this.cashInMachine == 0) {
            this.currentState = new OutOfMoneyState();
        } else if (this.cashInMachine < MAX_WITHDRAWAL) {
            this.currentState = new LimitedState();
        } else {
            this.currentState = new ReadyState();
        }
    }

    public void withdraw(int amount) {
        currentState.withdraw(this, amount);
    }

    public void setState(ATMState state) {
        this.currentState=state;
    }

    public int getCashInMachine(){
        return this.cashInMachine;
    }

    public void setCashInMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }

    public int getMaxWithdrawal(){
        return MAX_WITHDRAWAL;
    }
}
