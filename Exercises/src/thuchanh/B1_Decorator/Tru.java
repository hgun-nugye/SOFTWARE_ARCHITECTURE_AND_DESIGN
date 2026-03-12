package thuchanh.B1_Decorator;

public class Tru extends BieuThucDecorator{
    private float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "("+ super.bieuThuc() + " - " + this.toanHang + ")";
    }

    @Override
    public float giaTri() {
        return super.giaTri() - this.toanHang;
    }
}
