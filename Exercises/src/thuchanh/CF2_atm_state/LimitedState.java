package thuchanh.CF2_atm_state;

public class LimitedState implements ATMState {
    @Override
    public void withdraw(ATMMachine context, int amount) {
        if (amount > context.getCashInMachine()) {
            System.out.println("ERROR: Vuot qua so tien con lai trong may ATM!");
            System.out.println("So tien con lai trong may la " + context.getCashInMachine() + " VND.");
            System.out.println("Vui long thu lai!");
            return;
        }
        System.out.println("SUCCESS: Dang rut so tien " + amount + " VND...");
        context.setCashInMachine(context.getCashInMachine() - amount);
        System.out.println("So du may ATM con " + context.getCashInMachine() + " VND.");

        if (context.getCashInMachine() == 0) {
            context.setState(new OutOfMoneyState());
            System.out.println("[SYSTEM] May ATM da sang trang thai HET TIEN");
        }
    }
}
