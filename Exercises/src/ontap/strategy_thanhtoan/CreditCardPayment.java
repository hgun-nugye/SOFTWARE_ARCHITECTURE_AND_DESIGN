package ontap.strategy_thanhtoan;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void thanhToan(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng: " + amount + " VND");
    }
}
