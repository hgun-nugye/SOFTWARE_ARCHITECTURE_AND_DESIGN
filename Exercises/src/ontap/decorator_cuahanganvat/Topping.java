package ontap.decorator_cuahanganvat;

public class Topping extends HoaDonDecorator{
    String ten;
    double gia;


    public Topping(HoaDon sanPham, String ten, double gia) {
        super(sanPham);
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public void getMoTa() {
        super.getMoTa();
        System.out.println(" + Topping: " + ten + " - Giá: " + gia);

    }

    @Override
    public double getGia() {
        return super.getGia() + gia;
    }
}
