package thuchanh.A1_Builder;

import java.util.List;

public class HoaDon {
    private HoaDonHeader header;
    private List<CTHD> chiTiet;

    public HoaDon(HoaDonHeader header, List<CTHD> chiTiet) {
        this.header = header;
        this.chiTiet = chiTiet;
    }

    @Override
    public String toString() {
        return "\t\t\tHÓA ĐƠN\n"+
                header +
                "\n-----------------------------------------------------" +
                "\n\t\t\tCHI TIẾT\nSản phẩm\t\tSố lượng\tĐơn giá\t\t\tChiết khấu\n"+ chiTiet;
    }
}
