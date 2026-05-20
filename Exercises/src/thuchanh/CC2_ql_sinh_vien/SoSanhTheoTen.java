package thuchanh.CC2_ql_sinh_vien;

public class SoSanhTheoTen implements ISoSanh<SinhVien> {
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int kq = layTen(o1.getHoTen()).compareTo(layTen(o2.getHoTen()));
        if (kq > 0) return 1;
        if (kq < 0) return -1;
        return 0;
    }

    private String layTen(String hoTen) {
        if (hoTen == null || hoTen.trim().isEmpty()) return "";
        String[] parts = hoTen.trim().split("\\s+");
        return parts[parts.length - 1];
    }
}
