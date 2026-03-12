package thuchanh.B4_CompositeKhoaHoc;

import java.util.ArrayList;
import java.util.List;

public class NhomHocTap extends KHHT{
    public List<KHHT> danhSach;

    public NhomHocTap(String ten) {
        super(ten);
        this.danhSach = new ArrayList<>();
    }

    @Override
    public int tongSoTinChi() {
       int tongTC=0;
       for(KHHT k: danhSach){
           tongTC+=k.tongSoTinChi();
       }
       return tongTC;
    }

    @Override
    public double tongSoHocPhi() {
        double tongHP=0;
        for(KHHT k:danhSach){
            tongHP+=k.tongSoHocPhi();
        }
        return tongHP;
    }

    @Override
    public String lietKe(String prefix) {
        String formattedHP = String.format("%,.0f VNĐ", this.tongSoHocPhi());
        StringBuilder sb = new StringBuilder();
        sb.append(prefix)
                .append("└── ")
                .append(String.format("%-34s", this.ten)) // Căn lề trái 20 ký tự cho tên
                .append(" | Tín chỉ: ").append(String.format("%2d", this.tongSoTinChi()))
                .append(" | Học phí: ").append(formattedHP)
                .append("\n");

        for(KHHT k:danhSach){
            sb.append(k.lietKe(prefix+"    "));
        }
        return sb.toString();
    }

    public void them(KHHT kh){
        danhSach.add(kh);
    }

    public void xoa(KHHT kh){
        danhSach.remove(kh);
    }
}
