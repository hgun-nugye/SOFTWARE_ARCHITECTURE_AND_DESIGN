package ontap.observer_chungkhoan;

public class ConservativeInvestor implements Investor{
    private String name;

    public ConservativeInvestor(String name) {
        this.name = name;
    }

    @Override
    public void notify(String stockName, double price) {
        System.out.println("[" + name + "] Nhan thong bao: Gia: "+ price + " cua co phieu: " + stockName);
    }
}
