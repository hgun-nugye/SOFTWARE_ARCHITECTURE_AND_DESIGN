package ontap.decorator_cuahanganvat;

public class SanPhamCoBan extends HoaDon {
    String ten, moTa;
    Double gia;

    public SanPhamCoBan(String ten, String moTa, Double gia) {
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
    }

    @Override
    public void getMoTa() {
        System.out.println("Sản phẩm: " + ten);
        System.out.println("Mô tả: " + moTa);
        System.out.println("Giá: " + gia);
    }

    @Override
    public double getGia() {
        return gia;
    }
}
