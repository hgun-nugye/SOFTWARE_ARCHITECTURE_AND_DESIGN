package thuchanh.CC1_tinh_toan;

public class Context {
    private Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan){
        this.tinhToan = tinhToan;
    }

    public float tinh(float a, float b){
        if (tinhToan== null){
            throw new IllegalStateException("Phep toan chua duoc thiet lap");
        }
        return this.tinhToan.tinh(a, b);
    }
}
