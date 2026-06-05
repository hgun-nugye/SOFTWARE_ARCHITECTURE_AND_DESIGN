package ontap.chainofresponsibility_congty;

public class SupportHandler {
    private SupportHandler nextHanlder;

    public SupportHandler setNextHandler(SupportHandler next){
        this.nextHanlder=next;
        return nextHanlder;
    }

    public void handlerRequest(String request){
        if(nextHanlder==null){
            System.out.println("Vui lòng chọn người xử lý!");
        }
        else nextHanlder.handlerRequest(request);
    }
}
