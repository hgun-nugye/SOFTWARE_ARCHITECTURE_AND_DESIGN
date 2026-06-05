package thuchanh.review.state;

public class Main {
    public static void main(String[] args) {
        ThueBao simA = new ThueBao(50000);
        simA.inThongTin();

        simA.napTien(125000);
        simA.thucHienCuocGoi(30);
        simA.inThongTin();

        simA.napTien(75000);
        simA.inThongTin();
    }
}
