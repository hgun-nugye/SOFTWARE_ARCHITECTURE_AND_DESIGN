package ontap.observer_chungkhoan;

public class AggressiveInvestor implements Investor{
    private String name;

    public AggressiveInvestor(String name) {
        this.name = name;
    }

    @Override
    public void notify(String stockName, double price) {
        System.out.println("[" + name+ "] Nhan thong bao: Gia: "+ price + " cua co phieu: " + stockName);
    }
}
