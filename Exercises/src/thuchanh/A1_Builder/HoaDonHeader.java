package thuchanh.A1_Builder;

import java.util.Date;

public class HoaDonHeader {
    private String maHoaDon, tenKH;
    private Date NgayBan;

    public HoaDonHeader(String maHoaDon, String tenKH, Date ngayBan) {
        this.maHoaDon = maHoaDon;
        this.tenKH = tenKH;
        NgayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "Mã HD\t\t" + "Tên KH\t\t" + "Ngày Bán\t\n"+
                maHoaDon + "\t" + tenKH + "\t" + NgayBan;
    }
}
