package ontap.strategy_thanhtoan;

public class Main {
    public static void main(String[] args) {
        Order o1= new Order(1_000_000);
        o1.thanhToan();
        o1.setPay(new CODPayment()).thanhToan();

        Order o2= new Order(4_000_000);
        o2.setPay(new BankTransferPayment()).thanhToan();
    }
}
