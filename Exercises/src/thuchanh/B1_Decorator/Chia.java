package thuchanh.B1_Decorator;

public class Chia extends BieuThucDecorator{
    protected int toanHang;

    public Chia(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        if (this.toanHang == 0) {
            throw new ArithmeticException("Lỗi: Không thể chia cho 0");
        }
        return super.giaTri()/this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return "("+ super.bieuThuc() + "/" + this.toanHang + ")";
    }
}
