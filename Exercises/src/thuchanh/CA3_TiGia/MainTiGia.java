package thuchanh.CA3_TiGia;

public class MainTiGia {
    public static void main(String[] args) {
        DichVuTiGia dv = new DichVuTiGia();
        NhaDauTu n1 = new NhaDauTu("Ngân hàng Agribank", 23800, 24200);
        NhaDauTu n2 = new NhaDauTu("Ngân hàng BIDV", 24000, 25000);
        NhaDauTu n3 = new NhaDauTu("Ngân hàng Vietcombank", 22000, 23500);
        System.out.println("Chưa có nhà đầu tư nào đăng ký nhận thông báo");
        dv.notifyNhaDauTu();
        System.out.println("\nĐăng ký nhà đầu tư nhận thông báo");
        System.out.println("Nhà đầu tư 1: " + n1.name + " với số tiền " + n1.giaVND + " VND");
        dv.addNhaDauTu(n1);
        System.out.println("Nhà đầu tư 2: " + n2.name + " với số tiền " + n2.giaVND + " VND");
        dv.addNhaDauTu(n2);
        System.out.println("Nhà đầu tư 3: " + n3.name + " với số tiền " + n3.giaVND + " VND");
        dv.addNhaDauTu(n3);

        System.out.println();
        dv.setRate(24500);
        dv.notifyNhaDauTu();

        System.out.println("\nNhà đầu tư "+n2.name+" rút khỏi danh sách nhận thông báo");
        dv.removeNhaDauTu(n2);

        System.out.println();
        dv.setRate(25000);
        dv.notifyNhaDauTu();
    }
}
