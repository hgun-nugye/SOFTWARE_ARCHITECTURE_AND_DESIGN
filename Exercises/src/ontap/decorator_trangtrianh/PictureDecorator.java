package ontap.decorator_trangtrianh;

public class PictureDecorator extends Picture {
    Picture picture;

    public PictureDecorator(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void show() {
        picture.show();
    }
}
