package ontap.state_kiemsoatve;

public class Main {
    public static void main(String[] args) {
        TurnstileGate gate1= new TurnstileGate();
        System.out.println("Cong dang dong...");

        gate1.insertCard();
        gate1.passThrough();
    }
}
