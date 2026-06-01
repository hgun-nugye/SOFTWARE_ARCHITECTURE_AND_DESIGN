package thuchanh.review.chain_of_responsibility;

public abstract class TinhTienHandler {
    protected TinhTienHandler capTiepTheo;

    public TinhTienHandler setCapTiepTheo(TinhTienHandler capTiepTheo) {
        this.capTiepTheo = capTiepTheo;
        return this.capTiepTheo;
    }

    public abstract void tinhTien(double soKhoiConLai, HoaDon hoaDon);
}
