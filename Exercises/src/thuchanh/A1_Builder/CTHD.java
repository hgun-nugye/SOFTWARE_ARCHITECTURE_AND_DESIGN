package thuchanh.A1_Builder;

public class CTHD {
    String sanPham;
    int soLuong;
    double donGia, chietKhau;

    public CTHD(String sanPham, int soLuong, double donGia, double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return String.format("\n%-20s %-5d %-18.2f %-10.2f%n",
                sanPham, soLuong, donGia, chietKhau);
    }
}
