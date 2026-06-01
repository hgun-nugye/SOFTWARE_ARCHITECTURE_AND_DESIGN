package thuchanh.review.chain_of_responsibility;

public class TinhTienBac3 extends TinhTienHandler{
    @Override
    public void tinhTien(double soKhoiConLai, HoaDon hoaDon) {
        if (soKhoiConLai > 0) {
            double khoiTinhBac1 = Math.min(soKhoiConLai, 10);
            double tien = khoiTinhBac1 * 9000;

            hoaDon.congTien(tien);
            hoaDon.themChiTiet("Bac 3 (20-30m3): " + khoiTinhBac1 + "m3 x 9000 = " + tien + " VND");
            double khoiDu = soKhoiConLai - khoiTinhBac1;
            if (khoiDu > 0 && capTiepTheo != null) {
                capTiepTheo.tinhTien(khoiDu, hoaDon);
            }
        }
    }
}
