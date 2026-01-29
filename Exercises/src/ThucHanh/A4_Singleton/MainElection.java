package ThucHanh.A4_Singleton;

public class MainElection {
    public static void main(String[] args) {
        User user1 = new User("Nguyen Van A");
        User user2 = new User("Tran Thi B");
        User user3 = new User("Le Van C");
        User user4 = new User("Pham Thi D");

        user1.vote("Donald Trump");
        user2.vote("Joe Biden");
        user3.vote("Donald Trump");
        user4.vote("Joe Biden");
        user1.vote("Joe Biden"); // Thử bầu lại
        Election.getInstance().printResult();
    }
}
