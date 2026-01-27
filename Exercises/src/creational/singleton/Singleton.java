package creational.singleton;

public class Singleton {
    private static Singleton instance;
    private int cout = 0;
    private Singleton() {
    }

    protected static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void myPrint(){
        System.out.println(++cout);
    }
}
