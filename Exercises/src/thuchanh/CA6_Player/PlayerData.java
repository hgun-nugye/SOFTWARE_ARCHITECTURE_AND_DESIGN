package thuchanh.CA6_Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int thoiGian;
    private int countDown;
    private int grade;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(thoiGian, countDown, grade);
        }
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        notifyObservers();
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
        notifyObservers();

    }

    public void setGrade(int grade) {
        this.grade = grade;
        notifyObservers();

    }

    public void setgameData(int thoiGian, int countDown, int grade) {
        this.thoiGian = thoiGian;
        this.countDown = countDown;
        this.grade = grade;
        notifyObservers();
    }
}
