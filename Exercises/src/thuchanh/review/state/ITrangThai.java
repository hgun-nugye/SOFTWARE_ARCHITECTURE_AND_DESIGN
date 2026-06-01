package thuchanh.review.state;

public interface ITrangThai {
    void napTien(ThueBao context,double soTien);
    void thucHienCuocGoi(ThueBao context,int soGiay);
    void inThongTin(ThueBao context);
}
