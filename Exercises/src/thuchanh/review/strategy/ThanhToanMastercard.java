package thuchanh.review.strategy;

public class ThanhToanMastercard implements IThanhToanStrategy {
    @Override
    public void thanhToan(double soTienCanThanhToan) {
        double tienGiamThem = 0;
        if (soTienCanThanhToan >= 3_000_000) {
            tienGiamThem= soTienCanThanhToan*0.05;
        }
        tienGiamThem= Math.max(tienGiamThem, 300_000);
        double tienCuoiCung = soTienCanThanhToan - tienGiamThem;
        System.out.println("[Mastercard] Giam: " + tienGiamThem);
        System.out.println("Thanh toan Mastercard: " + tienCuoiCung + "VND");
    }
}
