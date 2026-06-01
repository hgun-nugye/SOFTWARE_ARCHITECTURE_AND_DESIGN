package thuchanh.review.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private String maKH;
    private String tenKH;
    private double tongSoKhoi;
    private double tongTien;
    private List<String> chiTietTungBac;

    public HoaDon(String maKH, String tenKH, double tongSoKhoi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tongSoKhoi = tongSoKhoi;
        this.tongTien = 0;
        this.chiTietTungBac = new ArrayList<>();
    }

    public double getTongSoKhoi() {
        return tongSoKhoi;
    }

    public void congTien(double tien) {
        this.tongTien += tien;
    }

    public void themChiTiet(String chiTiet) {
        chiTietTungBac.add(chiTiet);
    }

    public void inHoaDon(){
        System.out.println("HOA DON TIEN NUOC");
        System.out.println("Ma Khach hang: " + maKH);
        System.out.println("Ten Khach hang: " + tenKH);
        System.out.println("So khoi su dung: " + tongSoKhoi +"m3");
        System.out.println("Chi tiet tinh tien");
        for(String chiTiet : chiTietTungBac){
            System.out.println(chiTiet);
        }
        System.out.println("--------------------------------------------");
        System.out.println("TONG TIEN PHAI TRA: "+ tongTien +" VND");
        System.out.println("--------------------------------------------");

    }

}
