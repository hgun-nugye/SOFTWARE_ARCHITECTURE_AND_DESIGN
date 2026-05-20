package thuchanh.CC3_mua_hang;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<MatHang> dsMh = new ArrayList<>();
    private IThanhToan hinhThucThanhToan;
    private IKhuyenMai hinhThucKhuyenMai;

    public void themMH(MatHang mh) {
        dsMh.add(mh);
    }

    public void setHinhThucThanhToan(IThanhToan hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public void setHinhThucKhuyenMai(IKhuyenMai hinhThucKhuyenMai) {
        this.hinhThucKhuyenMai = hinhThucKhuyenMai;
    }

    public double tinhTongTienHang() {
        double tong = 0;
        for (MatHang mh : dsMh) {
            tong += mh.getThanhTien();
        }
        return tong;
    }

    public void ThanhToan(){
        System.out.println("--HOA DON THANH TOAN--");
        double tongTienHang = tinhTongTienHang();
        for (MatHang mh :dsMh){
            System.out.println(mh.toString());
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Tong tien hang: %.0f VND\n", tongTienHang);

        double tienGiamThanhToan = 0;
        if(hinhThucThanhToan!=null){
            tienGiamThanhToan = hinhThucThanhToan.tinhTienGiam(tongTienHang);
            System.out.printf("Giam gia thanh toan: %.0f VND\n", tienGiamThanhToan);
        }

        double tienKM = 0;
        if(hinhThucKhuyenMai!=null){
            tienKM = hinhThucKhuyenMai.tinhTienKhuyenMai(tongTienHang);
            System.out.printf("Tien khuyen mai: %.0f VND\n", tienKM);
        }

        double tienCanTT= tongTienHang - tienGiamThanhToan - tienKM;
        tienCanTT= Math.max(tienCanTT,0);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("SO TIEN CAN THANH TOAN: %.0f VND\n", tienCanTT);
        System.out.println("-------------------------------------------------------------");
    }
}
