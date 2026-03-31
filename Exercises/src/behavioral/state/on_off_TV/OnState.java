package behavioral.state.on_off_TV;

public class OnState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("TV off");
        remote.state= new OffState();
    }
}
