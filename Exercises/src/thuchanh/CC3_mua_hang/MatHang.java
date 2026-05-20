package thuchanh.CC3_mua_hang;

public class MatHang {
    private String tenMatHang;
    private double donGia;
    private int soLuong;

    public MatHang(String tenMatHang, double donGia, int soLuong) {
        this.tenMatHang = tenMatHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public double getThanhTien(){
        return soLuong*donGia;
    }

    @Override
    public String toString() {
        return String.format("- %s: %d x %.0f = %.0f", tenMatHang, soLuong, donGia, getThanhTien());
    }
}
