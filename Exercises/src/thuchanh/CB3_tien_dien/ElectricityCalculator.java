package thuchanh.CB3_tien_dien;

public abstract class ElectricityCalculator {
    protected ElectricityCalculator nextCalculator;

    public ElectricityCalculator setNextCalculator(ElectricityCalculator nextCalculator) {
        this.nextCalculator = nextCalculator;
        return this.nextCalculator;
    }

    public abstract double calculateBill(int kwh);
}
