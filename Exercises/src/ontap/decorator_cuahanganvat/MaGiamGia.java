package ontap.decorator_cuahanganvat;

public class MaGiamGia extends HoaDonDecorator{
    String ten;
    double giaTriGiam;

    public MaGiamGia(HoaDon sanPham, String ten, double giaTriGiam) {
        super(sanPham);
        this.ten = ten;
        this.giaTriGiam=giaTriGiam;
    }

    @Override
    public void getMoTa() {
        super.getMoTa();
        System.out.println("Mã giảm giá: " + ten + " - Giá trị giảm: " + giaTriGiam);
    }

    @Override
    public double getGia() {
        return super.getGia()*(1-giaTriGiam/100);
    }
}
