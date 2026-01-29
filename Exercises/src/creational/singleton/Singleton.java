package creational.singleton;

public class Singleton {
    private static Singleton instance; //static tạo bản sao duy nhất
    private int count = 0;
    private Singleton() {
    }

    //static để tạo bản sao duy nhất  không cần tạo đối tượng mới
    protected static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void myPrint(){
        System.out.println(++count);
    }
}
