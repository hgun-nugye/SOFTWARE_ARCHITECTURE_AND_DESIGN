package thuchanh.CF2_atm_state;

public class ReadyState implements ATMState {

    @Override
    public void withdraw(ATMMachine context, int amount) {
        if(amount > context.getMaxWithdrawal()){
            System.out.println("Vuot qua han muc cho phep rut toi da!");
            System.out.println("Han muc rut toi da la " + context.getMaxWithdrawal() + " VND/lan.");
            System.out.println("Vui long thu lai!");
            return;
        }
        System.out.println("SUCCESS: Dang rut so tien " + amount + " VND...");
        context.setCashInMachine(context.getCashInMachine()-amount);
        System.out.println("So du may ATM con " + context.getCashInMachine() + " VND.");

        if(context.getCashInMachine() ==0){
            context.setState(new OutOfMoneyState());
            System.out.println("[SYSTEM] May ATM da sang trang thai HET TIEN");
        } else if(context.getCashInMachine() <context.getMaxWithdrawal()){
            context.setState(new LimitedState());
            System.out.println("[SYSTEM] May ATM da sang trang thai HAN CHE");
        }
    }
}
