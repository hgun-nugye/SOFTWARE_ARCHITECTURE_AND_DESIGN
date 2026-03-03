package structural.decorator.beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(String description, Beverage beverage) {
        super(description, beverage);
    }

    @Override
    public float cost() {
        return beverage.cost() + 5000;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }
}
