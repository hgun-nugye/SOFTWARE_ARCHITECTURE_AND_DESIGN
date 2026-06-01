package thuchanh.review.strategy;

public class ThanhToanCOD implements IThanhToanStrategy {
    @Override
    public void thanhToan(double soTienCanThanhToan) {
        double tienGiamThem=0;
        if (soTienCanThanhToan >= 2_000_000) {
            tienGiamThem= soTienCanThanhToan*0.02;
        }
        double tienCuoiCung = soTienCanThanhToan - tienGiamThem;
        System.out.println("[COD] Giam: " + tienGiamThem);
        System.out.println("Thanh toan COD: " + tienCuoiCung + "VND");

    }
}
