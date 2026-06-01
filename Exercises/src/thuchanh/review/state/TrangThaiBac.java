package thuchanh.review.state;

public class TrangThaiBac implements ITrangThai {
    private final double CUOC_GIAY = 1500 / 60;

    @Override
    public void napTien(ThueBao context, double soTien) {
        context.setSoDu(context.getSoDu() + soTien * 0.05);
        System.out.println("Nap thanh cong " + soTien + " VND. Khuyen mai 5%");
    }

    @Override
    public void thucHienCuocGoi(ThueBao context, int soGiay) {
        double chiPhi = soGiay * CUOC_GIAY;
        if (context.getSoDu() >= chiPhi) {
            context.setSoDu(context.getSoDu() - chiPhi);
            System.out.println("Cuoc goi thanh cong. Chi phi: " + chiPhi + " VND. So du hien tai: " + context.getSoDu() + " VND");
        } else {
            System.out.println("So du khong du de thuc hien cuoc goi.");
        }
    }

    @Override
    public void inThongTin(ThueBao context) {
        System.out.println("THONG TIN THUE BAO");
        System.out.println("- Trang thai: Bac");
        System.out.println("- So du hien tai: " + context.getSoDu() + " VND");
        int giayToiDa =(int) (context.getSoDu() / CUOC_GIAY);
        System.out.println("- Thoi gian goi toi da : " + giayToiDa / 60 + " phut " + (giayToiDa % 60) + " giay");
    }
}
