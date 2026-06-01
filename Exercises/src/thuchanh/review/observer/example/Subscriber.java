package thuchanh.review.observer.example;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(String title) {
        System.out.println("Xin chao " + name +", video moi '" + title +"' da co tren kenh ");
    }
}
