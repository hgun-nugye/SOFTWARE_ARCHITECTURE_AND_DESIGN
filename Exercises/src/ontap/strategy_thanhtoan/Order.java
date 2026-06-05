package ontap.strategy_thanhtoan;

public class Order {
    private double amount;
    private PaymentStrategy pay;

    public Order(double amount) {
        this.amount = amount;
    }

    public Order setPay(PaymentStrategy pay) {
        this.pay = pay;
        return this;
    }

    public void thanhToan() {
        if (pay == null) System.out.println("Vui lòng chọn phương thức thanh toán");
        else this.pay.thanhToan(this.amount);
    }
}
