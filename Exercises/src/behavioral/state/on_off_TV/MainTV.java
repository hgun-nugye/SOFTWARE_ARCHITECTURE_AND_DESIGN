package behavioral.state.on_off_TV;

public class MainTV {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        System.out.println("Nhan lan 1:");
        remote.powerPress();
        System.out.println("Nhan lan 2:");
        remote.powerPress();
        System.out.println("Nhan lan 3:");
        remote.powerPress();
        System.out.println("Nhan lan 4:");
        remote.powerPress();
    }
}
