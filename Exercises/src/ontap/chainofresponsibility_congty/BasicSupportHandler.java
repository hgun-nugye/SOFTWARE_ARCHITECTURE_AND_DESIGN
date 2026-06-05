package ontap.chainofresponsibility_congty;

public class BasicSupportHandler extends SupportHandler{
    private SupportHandler nextHandler;
    private String name;
    private String position;

    public BasicSupportHandler(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public SupportHandler setNextHandler(SupportHandler next) {
        return this.nextHandler =next;
    }

    @Override
    public void handlerRequest(String request) {
        if (request.equalsIgnoreCase("reset password")) {
            System.out.println(position+" " + name +" : Đã xử lý yêu cầu reset password.");
        } else if (nextHandler != null) {
            nextHandler.handlerRequest(request);
        }
    }
}
