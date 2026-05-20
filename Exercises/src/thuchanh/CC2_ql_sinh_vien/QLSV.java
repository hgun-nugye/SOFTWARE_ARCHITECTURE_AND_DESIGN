package thuchanh.CC2_ql_sinh_vien;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    private List<SinhVien> dssv = new ArrayList<>();
    private ISoSanh<SinhVien> soSanh;

    public void setSoSanh(ISoSanh<SinhVien> sosanh) {
        this.soSanh = sosanh;
    }

    public void themSV(SinhVien sv) {
        dssv.add(sv);
    }

    public void sapXep() {
        if (soSanh == null) {
            System.out.println("Vui long chon tieu chi sap xep!");

            return;
        }

        int n = dssv.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (soSanh.soSanh(dssv.get(i), dssv.get(j)) == 1) {
                    SinhVien temp = dssv.get(i);
                    dssv.set(i, dssv.get(j));
                    dssv.set(j, temp);
                }
            }
        }
    }

    public void inDS() {
        for (SinhVien sv : dssv) {
            System.out.println(sv.toString());
        }
    }

}
