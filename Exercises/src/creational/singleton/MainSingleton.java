package creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.myPrint();
        s2.myPrint();
        s1.myPrint();
        s1.myPrint();
        s2.myPrint();
    }
}
