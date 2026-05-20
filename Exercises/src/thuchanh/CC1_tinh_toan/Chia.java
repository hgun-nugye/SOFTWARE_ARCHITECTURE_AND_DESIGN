package thuchanh.CC1_tinh_toan;

public class Chia implements Tinh {
    @Override
    public float tinh(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return a / b;
    }
}
