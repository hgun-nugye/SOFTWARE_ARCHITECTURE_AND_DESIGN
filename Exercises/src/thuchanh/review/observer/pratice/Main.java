package thuchanh.review.observer.pratice;

public class Main {
    public static void main(String[] args) {
        Topic techTopic = new Topic();

        ThanhVienA a1= new ThanhVienA("Nguyen Ha Hao");
        ThanhVienB b1 = new ThanhVienB(" Tran Kien Hao");

        techTopic.dangKy(a1);
        techTopic.dangKy(b1);

        techTopic.taoTinMoi("Java co gi moi?");
        techTopic.taoTinMoi("Spring Boot co gi moi?");

        techTopic.capNhatTin(1, "Java 21 ra mat!");
    }
}
