package ontap.chainofresponsibility_congty;

public class Main {
    public static void main(String[] args) {
        SupportHandler basic = new BasicSupportHandler("Alice", "Basic Support");
        SupportHandler technical = new TechnicalSupportHandler("Bob", "Technical Support");
        SupportHandler manager = new ManagerSupportHandler("Charlie", "Manager");

        // Tạo chain
        basic.setNextHandler(technical);
        technical.setNextHandler(manager);

        // Test các yêu cầu
        basic.handlerRequest("reset password");
        basic.handlerRequest("server down");
        basic.handlerRequest("refund request");
        basic.handlerRequest("unknown issue");
    }
}
