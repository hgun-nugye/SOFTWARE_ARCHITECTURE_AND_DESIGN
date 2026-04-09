package thuchanh.CB3_tien_dien;

public class MainTienDien {
    public static void main(String[] args) {
        ElectricityCalculator bac1 = new TierCalculator("Bac 1 (0-50)", 50, 1806);
        ElectricityCalculator bac2 = new TierCalculator("Bac 2 (51-100)", 50, 1866);
        ElectricityCalculator bac3 = new TierCalculator("Bac 3 (101-200)", 100, 2167);
        ElectricityCalculator bac4 = new TierCalculator("Bac 4 (201-300)", 100, 2729);
        ElectricityCalculator bac5 = new TierCalculator("Bac 5 (301-400)", 100, 3050);
        ElectricityCalculator bac6 = new TierCalculator("Bac 6 (tren 400)", Integer.MAX_VALUE, 3151);

        bac1.setNextCalculator(bac2)
                .setNextCalculator(bac3)
                .setNextCalculator(bac4)
                .setNextCalculator(bac5)
                .setNextCalculator(bac6);

       testCalculateBill(bac1, 45);
       testCalculateBill(bac1, 145);
       testCalculateBill(bac1, 245);
       testCalculateBill(bac1, 345);
       testCalculateBill(bac1, 445);

    }

    private static void testCalculateBill(ElectricityCalculator chainHead, int kwh) {
        System.out.println("\tPHIẾU TÍNH TIỀN ĐIỆN");
        System.out.println("So dien tieu thu: " + kwh + " kWh");
        double bill = chainHead.calculateBill(kwh);
        System.out.printf("Tong tien %d kWh: %.2f VND\n\n", kwh, bill);
    }
}
