package ontap.strategy_thanhtoan;

public class BankTransferPayment implements PaymentStrategy{
    @Override
    public void thanhToan(double amount) {
        System.out.println("Thanh toán bằng chuyển khoản ngân hàng: " + amount + " VND");
    }
}
