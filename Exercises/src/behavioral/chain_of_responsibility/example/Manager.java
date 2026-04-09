package behavioral.chain_of_responsibility.example;

public class Manager extends Approver {
    @Override
    public void processRequest(double amount) {
        if (amount > 10_000_000 && amount <= 50_000_000) {
            System.out.println("Manager da duyet khoan chi tieu: " + amount + " VND");
        } else if (nextApprover != null) {
            System.out.println("Manager khong du quyen, chuyen len cap tren...");
            nextApprover.processRequest(amount);
        }
    }
}
