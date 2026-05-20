package thuchanh.CC3_mua_hang;

public class ThanhToanAirpay implements IThanhToan {
    @Override
    public double tinhTienGiam(double tongTienHang) {
        if (tongTienHang >= 1000000) {
            return tongTienHang * 0.03;
        }
        return 0;
    }
}
