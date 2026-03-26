package thuchanh.CA6_Player;

import java.util.List;

public class Dashboard implements Observer{
    private int thoiGian;
    private int countDown;
    private int grade;

    @Override
    public void update(int thoiGian, int countDown, int grade) {
        this.thoiGian = thoiGian;
        this.countDown = countDown;
        this.grade = grade;
        display();
    }

    public void display(){
        System.out.println("Thời gian: " + thoiGian + "\tCountDown: " + countDown + "\tGrade: " + grade);
    }
}
