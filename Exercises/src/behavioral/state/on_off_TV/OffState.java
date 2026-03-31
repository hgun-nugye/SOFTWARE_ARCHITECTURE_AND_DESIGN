package behavioral.state.on_off_TV;

public class OffState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("TV on");
        remote.state= new OnState();
    }
}
