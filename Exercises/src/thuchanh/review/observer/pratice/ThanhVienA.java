package thuchanh.review.observer.pratice;

public class ThanhVienA implements IObserver{
    private String ten;

    public ThanhVienA(String ten) {
        this.ten = ten;
    }


    @Override
    public void nhanTinMoi(TinTuc tin) {
        System.out.println("[" + ten +"] Nhan tin moi: " + tin.getNoiDung());
    }

    @Override
    public void nhanTinCapNhat(TinTuc tin) {
        System.out.println("[" + ten +"] Nhan tin cap nhat: " + tin.getNoiDung());
    }
}
