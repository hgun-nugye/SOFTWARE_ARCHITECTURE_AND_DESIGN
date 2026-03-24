package behavioral.chain_of_responsibility.f88;

public class MainDuyetVay {
    public static void main(String[] args) {
        NV_DuyetVay chuTich = new ChuTich("Nguyễn Hoàng Hà", "Chủ tịch", 100_000_000);
        NV_DuyetVay giamDoc = new NhanVienChoVay("Trương Quách Phú", "Giám đốc", 80_000_000);
        NV_DuyetVay nhanVien = new NhanVienChoVay("Trần Hải Sơn", "Nhân viên", 50_000_000);
        NV_DuyetVay baoVe = new NhanVienChoVay("Nguyễn Kim An", "Bảo vệ", 0);
        baoVe.capTren(nhanVien).capTren(giamDoc).capTren(chuTich);
        nhanVien.duyetVay(65_000_000);
        giamDoc.duyetVay(102_000_000);
        baoVe.duyetVay(102_000_000);
    }
}
