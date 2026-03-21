package thuchanh.CA3_TiGia;

public class NhaDauTu implements DichVuTiGiaListener{
    String name;
    double giaVND;
    double giaUSD;

    public NhaDauTu(String name, double giaVND, double giaUSD) {
        this.name = name;
        this.giaVND = giaVND;
        this.giaUSD = giaUSD;
    }

    @Override
    public void update(double rate) {
        // Ví dụ chiến lược đơn giản
        if (rate >= giaUSD) {
            System.out.println(name + ": Bán USD khi tỉ giá = " + rate);
        } else {
            System.out.println(name + ": Mua USD khi tỉ giá = " + rate);
        }
    }
}
