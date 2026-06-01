package thuchanh.review.strategy;

public class MatHang {
    private String tenMH;
    private int soluong;
    private double donGia;

    public MatHang(String tenMH, int soluong, double donGia) {
        this.tenMH = tenMH;
        this.soluong = soluong;
        this.donGia = donGia;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoluong() {
        return soluong;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getThanhTien(){
        return soluong*donGia;
    }
}
