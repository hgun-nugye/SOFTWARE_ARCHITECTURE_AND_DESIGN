package thuchanh.review.chain_of_responsibility;

public class TinhTienBac4 extends TinhTienHandler{
    @Override
    public void tinhTien(double soKhoiConLai, HoaDon hoaDon) {
        if (soKhoiConLai > 0) {
            double tien = soKhoiConLai *12000;
            hoaDon.congTien(tien);
            hoaDon.themChiTiet("Bac 4 (tren 30m3): "+ soKhoiConLai +"m3 x 12000 = "+tien +" VND");
        }
    }
}
