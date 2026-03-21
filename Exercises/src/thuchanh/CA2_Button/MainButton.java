package thuchanh.CA2_Button;

public class MainButton {
    public static void main(String[] args) {
        Button btn= new Button();
        Activity activity= new Activity();
        System.out.println("Thêm hoạt động vào nút bấm.");
        btn.addListener(activity);
        System.out.println("Nhấn nút lần 1:");
        btn.click();
        System.out.println("Nhấn nút lần 2:");
        btn.click();
        System.out.println("Remove hoạt động khỏi nút bấm.");
        btn.removeListener();
        System.out.println("Nhấn nút lần 3:");
        btn.click();
    }
}
