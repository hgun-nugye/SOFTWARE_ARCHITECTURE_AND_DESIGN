package ontap.strategy_thanhtoan;

public class CODPayment implements PaymentStrategy{
    @Override
    public void thanhToan(double amount) {
        System.out.println("Thanh toán tiền mặt: "+ amount +" VND");
    }
}
