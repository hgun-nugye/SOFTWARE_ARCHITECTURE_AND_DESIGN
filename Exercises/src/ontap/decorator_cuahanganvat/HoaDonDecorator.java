package ontap.decorator_cuahanganvat;

public class HoaDonDecorator extends HoaDon {
    HoaDon sanPham;

    public HoaDonDecorator(HoaDon sanPham) {
      this.sanPham = sanPham;
    }

    @Override
    public void getMoTa() {
        sanPham.getMoTa();
    }

    @Override
    public double getGia() {
        return sanPham.getGia();
    }
}
