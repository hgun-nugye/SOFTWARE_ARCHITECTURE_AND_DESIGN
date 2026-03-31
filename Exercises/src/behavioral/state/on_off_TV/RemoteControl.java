package behavioral.state.on_off_TV;

public class RemoteControl {
    IRemoteState state;

    public RemoteControl() {
        this.state = new OffState();
    }
    public void setState(IRemoteState state){
        this.state=state;
    }
    public void powerPress(){
        state.handle(this);
    }
}
