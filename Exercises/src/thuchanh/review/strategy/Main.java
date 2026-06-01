package thuchanh.review.strategy;

import thuchanh.review.chain_of_responsibility.HoaDon;

public class Main {
    public static void main(String[] args) {
        GioHang gh1 = new GioHang();
        gh1.themMatHang(new MatHang("Macbook Air", 2, 33_000_000));
        gh1.themMatHang(new MatHang("Sach Nhap Mon Lap trinh Co ban", 1, 26000));
        gh1.setKhuyenMai(new KhuyenMaiCoDinh(50000));
        gh1.setThanhToan(new ThanhToanAirpay());
        gh1.thucHienThanhToan();
    }
}
