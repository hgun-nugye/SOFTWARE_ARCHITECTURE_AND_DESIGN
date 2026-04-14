package ontap.decorator_cuahanganvat;

public class DongGoiDacBiet extends HoaDonDecorator {
    String ten;
    double gia;

    public DongGoiDacBiet(HoaDon sanPham, String ten, double gia) {
        super(sanPham);
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public void getMoTa() {
        super.getMoTa();
        System.out.println("Đóng gói đặc biệt: " + ten + " - Giá: " + gia);
    }

    @Override
    public double getGia() {
        return super.getGia() + gia;
    }
}
