package thuchanh.review.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        TinhTienHandler b1= new TinhTienBac1();
        TinhTienHandler b2= new TinhTienBac2();
        TinhTienHandler b3= new TinhTienBac3();
        TinhTienHandler b4= new TinhTienBac4();
        b1.setCapTiepTheo(b2).setCapTiepTheo(b3).setCapTiepTheo(b4);

        HoaDon hd1 = new HoaDon("KH001", "Nguyen Kim Cuc", 33);
        HoaDon hd2 = new HoaDon("KH032", "Tran Thi Tuyet", 72);
        HoaDon hd3 = new HoaDon("KH017", "Le Minh Son", 81);

        b1.tinhTien(hd1.getTongSoKhoi(), hd1);
        hd1.inHoaDon();
        b1.tinhTien(hd2.getTongSoKhoi(), hd2);
        hd2.inHoaDon();
        b1.tinhTien(hd3.getTongSoKhoi(), hd3);
        hd3.inHoaDon();
    }
}
