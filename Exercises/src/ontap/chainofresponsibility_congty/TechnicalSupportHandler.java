package ontap.chainofresponsibility_congty;

public class TechnicalSupportHandler extends SupportHandler{
    private SupportHandler nextHandler;
    private String name;
    private String position;

    public TechnicalSupportHandler(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public SupportHandler setNextHandler(SupportHandler next) {
        return this.nextHandler =next;
    }

    @Override
    public void handlerRequest(String request) {
        if (request.equalsIgnoreCase("server down")) {
            System.out.println(position+" " + name +": Đã xử lý sự cố server.");
        } else if (nextHandler != null) {
            nextHandler.handlerRequest(request);
        }
    }
}
