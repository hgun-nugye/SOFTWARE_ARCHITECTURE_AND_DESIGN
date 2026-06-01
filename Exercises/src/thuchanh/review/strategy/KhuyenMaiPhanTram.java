package thuchanh.review.strategy;

public class KhuyenMaiPhanTram implements IKhuyenMaiStrategy{
    private double phanTramGiam;
    private double giamToiDa;

    public KhuyenMaiPhanTram(double phanTramGiam, double giamToiDa) {
        this.phanTramGiam = phanTramGiam;
        this.giamToiDa = giamToiDa;
    }

    @Override
    public double TinhTienGiam(double tongTien) {
        double tienGiamTheoPhanTram = tongTien * (phanTramGiam/100);
        return Math.min(tienGiamTheoPhanTram, giamToiDa);
    }
}
