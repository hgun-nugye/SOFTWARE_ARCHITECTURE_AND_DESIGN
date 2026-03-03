package structural.decorator.beverage;

public class Espresso extends Beverage{
    public Espresso(String description) {
        super(description);
    }

    @Override
    public float cost() {
        return 35000;
    }
}
