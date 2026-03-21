package behavioral.observer.atm;

public class MainATM {
    public static void main(String[] args) {
        ATM  atm = new ATM();
        TaiKhoan taikhoan = new TaiKhoan("Thanh Huong", 20_000_000, atm);
        System.out.println("Lần 1");
        atm.rutTien(10_000_000);
        taikhoan.duaThe();
        System.out.println("Lần 2");
        atm.rutTien(10_000_000);

        System.out.println("Lần 3");
        atm.rutTien(15_000_000);

        System.out.println("Lần 4");
        atm.rutTien(7_000_000);
        taikhoan.nhanThe();

        System.out.println("Lần 5");
        atm.rutTien(5_000_000);
    }
}
