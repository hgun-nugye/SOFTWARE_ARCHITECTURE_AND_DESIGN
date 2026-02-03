package thuchanh.A6;

public class SanPham {
    private String maSP, tenSP;
    private double donGia;
    private int soLuong;

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mã SP: ").append(maSP).append("\t");
        sb.append(String.format("Tên SP: %-15s\t\t", tenSP));
        sb.append(String.format("Đơn giá: %,.2f\t\t", donGia));
        sb.append("Số lượng: ").append(soLuong).append("\n");
        sb.append("--------------------------------------------------------------");
        return sb.toString();
    }

    public String getMaSP(){
        return maSP;
    }
}
