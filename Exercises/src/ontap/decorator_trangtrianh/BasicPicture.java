package ontap.decorator_trangtrianh;

public class BasicPicture extends Picture {

    String pictureName;

    public BasicPicture(String pictureName) {
        this.pictureName = pictureName;
    }

    @Override
    public void show() {
        System.out.println("Showing picture: " + pictureName);
    }

}
