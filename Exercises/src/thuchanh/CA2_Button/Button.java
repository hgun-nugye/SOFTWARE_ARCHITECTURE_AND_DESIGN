package thuchanh.CA2_Button;

public class Button {
    public ButtonListener buttonListener;

    public void addListener(ButtonListener buttonListener){
        this.buttonListener=buttonListener;
    }

    public void removeListener(){
        this.buttonListener=null;
    }

    public void click(){
        if(buttonListener==null){
            System.out.println("Chưa có hoạt động nào được thêm vào nút bấm!");
            return;
        }
        buttonListener.onClick();
    }



}
