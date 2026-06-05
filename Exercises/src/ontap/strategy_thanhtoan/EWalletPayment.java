package ontap.strategy_thanhtoan;

public class EWalletPayment implements PaymentStrategy{
    @Override
    public void thanhToan(double amount) {
        System.out.println("Thanh toán bằng ví điện tử: " + amount + " VND");
    }
}
