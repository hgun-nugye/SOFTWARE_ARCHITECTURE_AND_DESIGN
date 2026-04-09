package behavioral.chain_of_responsibility.example;

public class Main {
    public static void main(String[] args) {
        // 1.Khoi tao cac handler
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();

        // 2.Thiet lap chuoi (TeamLead -> Manager -> Director)
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);

        // 3.Gui requets vao dau chuoi
        System.out.println("--Toi xin mua chuot may tinh.--");
        teamLead.processRequest(5_000_000);

        System.out.println("\n--Yeu cau xin mua Macbook Pro.--");
        teamLead.processRequest(25_000_000);

        System.out.println("\n--Yeu cau xin mua server.--");
        teamLead.processRequest(50_000_000);

        System.out.println("\n--Yeu cau xin mua lai cong ty.--");
        teamLead.processRequest(500_000_000);

    }
}
