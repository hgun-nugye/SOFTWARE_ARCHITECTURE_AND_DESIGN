package thuchanh.B1_Decorator;

public class BieuThucDonGian extends BieuThuc{
    private float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(toanHang);
    }
}
