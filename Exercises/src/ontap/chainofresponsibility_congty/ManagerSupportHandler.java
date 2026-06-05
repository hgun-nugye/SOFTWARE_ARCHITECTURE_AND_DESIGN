package ontap.chainofresponsibility_congty;

public class ManagerSupportHandler extends SupportHandler {
    private String name;
    private String position;

    public ManagerSupportHandler(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public SupportHandler setNextHandler(SupportHandler next) {
        return null;
    }

    @Override
    public void handlerRequest(String request) {
        if (request.equalsIgnoreCase("refund request")) {
            System.out.println(position+" " + name + ": Đã xử lý yêu cầu hoàn tiền.");
        } else {
            System.out.println("Không có handler nào xử lý được yêu cầu: " + request);
        }
    }
}
