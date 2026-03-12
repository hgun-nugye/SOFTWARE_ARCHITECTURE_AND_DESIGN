package thuchanh.B4_CompositeKhoaHoc;

public abstract class KHHT {
    public String ten;

    public KHHT(String ten) {
        this.ten = ten;
    }

    public abstract int tongSoTinChi();
    public abstract  double tongSoHocPhi();
    public abstract String lietKe(String prefix);
}
