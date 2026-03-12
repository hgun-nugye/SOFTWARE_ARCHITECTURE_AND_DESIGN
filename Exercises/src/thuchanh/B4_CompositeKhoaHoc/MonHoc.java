package thuchanh.B4_CompositeKhoaHoc;

public class MonHoc extends KHHT{
    public int soTinChi;
    public double hocPhi;

    public MonHoc(String ten, int soTinChi, double hocPhi) {
        super(ten);
        this.soTinChi = soTinChi;
        this.hocPhi = hocPhi;
    }

    @Override
    public int tongSoTinChi() {
        return this.soTinChi;
    }

    @Override
    public double tongSoHocPhi() {
        return this.hocPhi*this.soTinChi;
    }

    @Override
    public String lietKe(String prefix) {
        return String.format("%s└── %-30s | Số tín chỉ: %2d | Học phí: %,.0f VNĐ\n",
                prefix,
                this.ten,
                this.soTinChi,
                this.hocPhi);    }
}
