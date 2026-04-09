package behavioral.chain_of_responsibility.example;

public class TeamLead extends Approver {
    @Override
    public void processRequest(double amount) {
        if (amount < 10_000_000) {
            System.out.println("TeamLead da duyet khoan chi tieu: " + amount + " VND");
        } else if (nextApprover != null) {
            System.out.println("TeamLead khong du quyen, chuyen len cap tren...");
            nextApprover.processRequest(amount);
        }
    }
}
