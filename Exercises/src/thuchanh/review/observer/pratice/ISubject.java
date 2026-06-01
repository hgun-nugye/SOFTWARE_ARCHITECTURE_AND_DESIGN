package thuchanh.review.observer.pratice;

public interface ISubject {
    void dangKy(IObserver observer);
    void huyDangKy(IObserver observer);
    void thongBaoTinMoi(TinTuc tin);
    void thongBaoCapNhat(TinTuc tin);
}
