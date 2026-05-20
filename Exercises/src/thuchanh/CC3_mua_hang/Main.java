package thuchanh.CC3_mua_hang;

public class Main {
    public static void main(String[] args) {
        MatHang mh1 = new MatHang("Laptop", 25000000, 1);
        MatHang mh2 = new MatHang("Điện thoại", 10000000, 1);
        MatHang mh3 = new MatHang("Tai nghe", 1000000, 5);

        GioHang cart = new GioHang();

        System.out.println("Them " + mh1.getTenMatHang() + " vao gio hang.");
        cart.themMH(mh1);

        System.out.println("Them " + mh3.getTenMatHang() + " vao gio hang.");
        cart.themMH(mh3);

        System.out.println("Thanh toan bang Airpay va khuyen mai 10% giam toi da 100000.");
        cart.setHinhThucThanhToan(new ThanhToanAirpay());
        cart.setHinhThucKhuyenMai(new KhuyenMaiPhanTramGiamToiDa(0.1, 100000));

        cart.ThanhToan();
    }
}
