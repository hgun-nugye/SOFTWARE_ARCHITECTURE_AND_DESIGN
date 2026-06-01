package thuchanh.review.strategy;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GioHang {
    private List<MatHang> dsMatHang = new ArrayList<>();
    private IKhuyenMaiStrategy khuyenMai = new KhongKhuyenMai();

    private IThanhToanStrategy thanhToan;

    public void themMatHang(MatHang mh) {
        dsMatHang.add(mh);
    }

    public void setKhuyenMai(IKhuyenMaiStrategy km) {
        this.khuyenMai = km;
    }

    public void setThanhToan(IThanhToanStrategy tt) {
        this.thanhToan = tt;
    }

    public double tinhTienGoc(){
        double tong =0;
        for(MatHang mh: dsMatHang){
            tong+=mh.getThanhTien();
        }
        return tong;
    }

    public void thucHienThanhToan(){
        if(dsMatHang.isEmpty()){
            System.out.println("Gio hang trong!");
            return;
        }
        if(thanhToan== null){
            System.out.println("Vui long chon phuong thuc thanh toan");
            return;
        }

        double tongTienGoc = tinhTienGoc();
        double tienGiamVoucher = khuyenMai.TinhTienGiam(tongTienGoc);
        double tienSauVoucher = tongTienGoc - tienGiamVoucher;

        NumberFormat nf = NumberFormat.getInstance(new Locale("vi", "VN"));

        System.out.println("HOA DON THANH TOAN");
        System.out.println("Tong tien goc: " + nf.format(tongTienGoc)+" VND");
        System.out.println("Ap dung khuyen mai: " + nf.format(tienGiamVoucher) +" VND");
        System.out.println("Thanh tien: " + nf.format(tienSauVoucher) +" VND");
        thanhToan.thanhToan(tienSauVoucher);
    }
}
