package thuchanh.A1_Builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDonBuilder {
    private HoaDonHeader currentHeader;
    private List<CTHD> currentChiTiet;

    public HoaDonBuilder(){
        this.currentChiTiet = new ArrayList<>();
    }

    public HoaDonBuilder setHeader(String maHoaDon, String tenKH, Date ngayBan) {
        this.currentHeader = new HoaDonHeader(maHoaDon, tenKH, ngayBan);
        return this;
    }

    public HoaDonBuilder addChiTiet (String sanPham, int soLuong, double donGia, double chietKhau) {
        CTHD cthd = new CTHD(sanPham, soLuong, donGia, chietKhau);
        this.currentChiTiet.add(cthd);
        return this;
    }

    public HoaDon build() {
        return new HoaDon(currentHeader, currentChiTiet);
    }
}
