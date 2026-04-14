package ontap.decorator_trangtrianh;

public class FilterDecorator extends PictureDecorator{
    public FilterDecorator(Picture picture) {
        super(picture);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Adding filter to picture");
    }
}
