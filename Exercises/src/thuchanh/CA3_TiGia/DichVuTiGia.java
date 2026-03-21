package thuchanh.CA3_TiGia;

import java.util.ArrayList;
import java.util.List;

public class DichVuTiGia {
    public List<DichVuTiGiaListener> nhaDauTu = new ArrayList<>();
    public double rate;

    public void addNhaDauTu(DichVuTiGiaListener nhaDauTu) {
       this.nhaDauTu.add(nhaDauTu);
    }

    public void removeNhaDauTu(DichVuTiGiaListener nhaDauTu) {
        this.nhaDauTu.remove(nhaDauTu);
    }

    public void setRate(double newRate) {
        this.rate = newRate;
        System.out.println("Tỉ giá USD-VND thay đổi: " + rate);
    }

    public void notifyNhaDauTu() {
        if (this.nhaDauTu.isEmpty()) {
            System.out.println("Không có nhà đầu tư nào để thông báo");
            return;
        }
        for (DichVuTiGiaListener ndt : this.nhaDauTu) {
            ndt.update(rate);
        }
    }

}
