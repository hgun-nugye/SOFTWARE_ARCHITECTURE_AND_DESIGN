package ontap.decorator_trangtrianh;

public class MainPicture {
    public static void main(String[] args) {
        Picture p1 = new BasicPicture("the picture of a sunset");
        Picture p2 = new WatermarkDecorator(p1);
        Picture p3 = new BorderDecorator(p2);

        System.out.println("Showing basic picture:");
        p1.show();
        System.out.println("\nShowing picture with watermark:");
        p2.show();
        System.out.println("\nShowing picture with watermark and border:");
        p3.show();
    }
}
