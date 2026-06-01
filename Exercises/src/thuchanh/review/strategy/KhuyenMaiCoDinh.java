package thuchanh.review.strategy;

public class KhuyenMaiCoDinh implements IKhuyenMaiStrategy{
    private double soTienGiam;

    public KhuyenMaiCoDinh(double soTienGiam) {
        this.soTienGiam = soTienGiam;
    }

    @Override
    public double TinhTienGiam(double tongTien) {
        return Math.min(soTienGiam, tongTien);
    }
}
