package thuchanh.A1_Builder;

import java.util.Date;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDonBuilder()
                .setHeader("HD001", "Nguyen Van A", new Date())
                .addChiTiet("SanPham1", 2, 100000, 0.1)
                .addChiTiet("SanPham2", 1, 200000, 0.05)
                .addChiTiet("SanPham3", 5, 50000, 0.2)
                .build();

        System.out.println(hoaDon);
    }
}
