package thuchanh.review.strategy;

public class ThanhToanAirpay implements IThanhToanStrategy{
    @Override
    public void thanhToan(double soTienCanThanhToan) {
        double tienGiamThem=0;
        if (soTienCanThanhToan >= 1_000_000) {
            tienGiamThem= soTienCanThanhToan*0.03;
        }
        double tienCuoiCung = soTienCanThanhToan - tienGiamThem;
        System.out.println("[Airpay] Giam: "+tienGiamThem);
        System.out.println("Thanh toan Airpay: " + tienCuoiCung + "VND");
    }
}
