package thuchanh.CA2_Button;

public class Activity implements ButtonListener{
    int count=0;

    @Override
    public void onClick() {
        count++;
        System.out.println("Nút bấm đã được nhấn " + count + " lần.");

    }
}
