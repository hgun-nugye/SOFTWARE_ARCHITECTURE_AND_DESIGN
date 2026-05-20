package thuchanh.strategy_example;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new MomoPayment());
        cart.checkout(5_000_000);
        cart.setPaymentStrategy(new CreaditCard());
        cart.checkout(2_000_000);
    }
}
