package ontap.decorator_cuahanganvat;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hd1 = new SanPhamCoBan("Pizza","Pizza hải sản thơm ngon", 100_000.0);
        HoaDon hd2 = new SanPhamCoBan("Coca-cola","Nước ngọt có ga", 20_000.0);
        hd1 = new MaGiamGia(hd1, "GIAM10", 10);
        hd1 = new DongGoiDacBiet(hd1, "Hộp đựng sang trọng", 5_000.0);
        hd2 = new MaGiamGia(hd2, "GIAM5", 5);
        hd2 = new DongGoiDacBiet(hd2, "Hộp đựng sang trọng", 2_000.0);
        System.out.println("Thông tin sản phẩm 1:");
        hd1.getMoTa();
        System.out.println("Thành tiền 1: " + hd1.getGia());

        System.out.println("\nThông tin sản phẩm 2:");
        hd2.getMoTa();
        System.out.println("Thành tiền: " + hd2.getGia());
    }
}
