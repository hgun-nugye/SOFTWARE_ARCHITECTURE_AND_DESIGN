package thuchanh.review.observer.example;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    private String latestVideo;


    @Override
    public void attach(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subscribers){
            observer.update(latestVideo);
        }

    }

    public void uploadVideo(String title){
        this.latestVideo=title;
        System.out.println("[Channel] da upload video: " + title);
        notifyObservers();
    }
}
