package thuchanh.CF2_atm_state;

public class MainATMState {
    public static void main(String[] args) {
        ATMMachine machine1 = new ATMMachine(100_000_000);

        System.out.println("Giao dich 1: Rut 100 trieu VND");
        machine1.withdraw(100_000_000);
        System.out.println("-----------------------------------------------");

        System.out.println("Giao dich 2: Rut 50 trieu VND");
        machine1.withdraw(50_000_000);
        System.out.println("-----------------------------------------------");

        System.out.println("Giao dich 3: Rut 40 trieu VND");
        machine1.withdraw(40_000_000);
        System.out.println("-----------------------------------------------");

        System.out.println("Giao dich 4: Rut 5 trieu VND");
        machine1.withdraw(5_000_000);
        System.out.println("-----------------------------------------------");

        System.out.println("Giao dich 5: Rut 10 trieu VND");
        machine1.withdraw(10_000_000);
        System.out.println("-----------------------------------------------");

        System.out.println("Giao dich 6: Rut 5 trieu VND");
        machine1.withdraw(5_000_000);
        System.out.println("-----------------------------------------------");

        System.out.println("Giao dich 7: Rut 10 trieu VND");
        machine1.withdraw(10_000_000);

    }
}
