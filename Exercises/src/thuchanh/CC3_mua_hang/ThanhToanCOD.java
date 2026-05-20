package thuchanh.CC3_mua_hang;

public class ThanhToanCOD implements IThanhToan {
    @Override
    public double tinhTienGiam(double tongTienHang) {
        if (tongTienHang >= 2000000) {
            return tongTienHang * 0.2;
        }

        return 0;
    }
}
