package thuchanh.B1_Decorator;

public class Cong extends BieuThucDecorator{
    private float toanHang;

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() + this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return "("+ super.bieuThuc() + " + " + this.toanHang + ")";
    }
}
