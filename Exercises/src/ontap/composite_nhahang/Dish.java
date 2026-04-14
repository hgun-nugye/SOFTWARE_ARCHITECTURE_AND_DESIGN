package ontap.composite_nhahang;

public class Dish extends AbstractDish {
    String info;
    double price;

    public Dish(String info, double price) {
        this.info = info;
        this.price = price;
    }

    @Override
    public void addDish(AbstractDish dish) {

    }

    @Override
    public void removeDish(AbstractDish dish) {

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + "\t|----" + info + " : " + price);
    }
}
