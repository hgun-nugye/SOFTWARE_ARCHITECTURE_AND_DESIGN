package ontap.observer_chungkhoan;

public class Main {
    public static void main(String[] args) {
        Stock stock1 = new Stock("Apple", 1500_000);
        Stock stock2 = new Stock("Google", 5500_000);

        stock2.addNDT(new AggressiveInvestor("NDT1"));
        stock2.notifyNDT();

        stock1.addNDT(new ConservativeInvestor("NDT2"));
        stock1.setPrice(9000_000);

    }
}
