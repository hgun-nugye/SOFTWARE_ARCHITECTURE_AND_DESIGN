package behavioral.chain_of_responsibility.example;

public class Director extends Approver {
    @Override
    public void processRequest(double amount) {
        if (amount > 50_000_000 && amount <= 200_000_000) {
            System.out.println("Director da duyet khoan chi tieu: " + amount + " VND");
        } else
            System.out.println("So tien qua lon, khong duyet!...");

    }
}
