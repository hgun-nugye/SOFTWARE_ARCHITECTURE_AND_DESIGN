package ontap.decorator_trangtrianh;

public class BorderDecorator extends PictureDecorator{
    public BorderDecorator(Picture picture) {
        super(picture);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Adding border to picture");
    }
}
