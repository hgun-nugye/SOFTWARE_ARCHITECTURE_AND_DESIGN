package thuchanh.button;

public class Activity implements OnClickListener{
    int soLanClick=0;

    private Button myButton;

    public Activity() {
        myButton = new Button();
        myButton.attach(this);
    }

    public void moPhongNguoiDungBamNut(){
        myButton.click();
    }

    @Override
    public void onClick() {
        soLanClick++;
        System.out.println("Đã click được " + soLanClick + " lần");
    }
}
