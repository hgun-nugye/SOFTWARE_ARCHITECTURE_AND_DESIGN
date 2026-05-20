package thuchanh.strategy_example;

public class MomoPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Thanh toan " + amount + "VND bang vi Momo thanh cong!");
    }
}
