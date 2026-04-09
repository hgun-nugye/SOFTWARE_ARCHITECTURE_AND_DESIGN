package thuchanh.CB3_tien_dien;

public class TierCalculator extends ElectricityCalculator {
    String tierName;
    int capacity;
    double price;

    public TierCalculator(String tierName, int capacity, double price) {
        this.tierName = tierName;
        this.capacity = capacity;
        this.price = price;
    }


    @Override
    public double calculateBill(int kwh) {
        if (kwh <= 0) {
            return 0;
        }
        int kwhToProcess = Math.min(kwh, capacity);
        double cost = kwhToProcess * price;
        System.out.println("- " + tierName + " tinh tien " + kwhToProcess + " kWh x " + price + " = " + cost + " VND");
        int remainingKwh = kwh - kwhToProcess;
        if (remainingKwh > 0 && nextCalculator != null) {
            cost += nextCalculator.calculateBill(remainingKwh);
        }
        return cost;
    }
}
