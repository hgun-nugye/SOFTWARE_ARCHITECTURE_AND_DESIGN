package thuchanh.strategy_example;

public class CreaditCard implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Thanh toan " + amount + "VND bang Credit Card thanh cong!");
    }
}
