package thuchanh.B1_Decorator;

public class Nhan extends BieuThucDecorator{
    private int toanHang;

    public Nhan(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() * this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return "("+ super.bieuThuc() + " * " + this.toanHang + ")";
    }
}
