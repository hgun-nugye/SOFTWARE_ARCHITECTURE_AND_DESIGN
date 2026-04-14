package ontap.composite_nhahang;

public abstract class AbstractDish {
    public abstract void addDish(AbstractDish dish);
    public abstract void removeDish(AbstractDish dish);
    public abstract double getPrice();
    public abstract void display(String prefix);
}
