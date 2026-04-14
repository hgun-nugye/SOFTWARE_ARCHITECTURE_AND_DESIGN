package ontap.decorator_cuahanganvat;

public class Sauce extends HoaDonDecorator {
    String ten;
    double gia;

    public Sauce(HoaDon sanPham, String ten, double gia) {
        super(sanPham);
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public double getGia() {
        return super.getGia() + gia;
    }

    @Override
    public void getMoTa() {
        super.getMoTa();
        System.out.println("Sốt" + ten + " - Giá: " + gia);
    }
}
