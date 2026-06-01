package thuchanh.review.observer.example;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel1 = new YoutubeChannel();
        Subscriber sv1 = new Subscriber("Nguyen Mai Lan");
        Subscriber sv2 = new Subscriber("Phan Dinh Tung");

        channel1.attach(sv1);
        channel1.attach(sv2);

        channel1.uploadVideo("Design patter, new for you!");
    }
}
