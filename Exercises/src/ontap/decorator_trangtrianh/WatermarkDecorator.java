package ontap.decorator_trangtrianh;

public class WatermarkDecorator extends PictureDecorator{
    public WatermarkDecorator(Picture picture) {
        super(picture);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Adding watermark to picture");
    }
}
