package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend("House Blend Coffee");

        System.out.println("Original:");
        System.out.println(beverage.getDescription() + " ₫" + beverage.cost());
        System.out.println("Sữa lần 1:");
        beverage = new Milk("Sữa cô gái Hà lan", beverage);
        System.out.println(beverage.getDescription() + " ₫" + beverage.cost());
        System.out.println("Sữa lần 2");
        beverage = new Milk("Sữa ông thọ", beverage);
        System.out.println(beverage.getDescription() + " ₫" + beverage.cost());

        System.out.println("-----------------------------");

        Beverage beverage2 = new Espresso("Espresso Coffee");
        System.out.println("Original:");
        System.out.println(beverage2.getDescription() + " ₫" + beverage2.cost());
        System.out.println("Mocha lần 1:");
        beverage2 = new Mocha("Mocha Nhật vị mới", beverage2);
        System.out.println(beverage2.getDescription() + " ₫" + beverage2.cost());
        System.out.println("Mocha lần 2");
        beverage2 = new Mocha("Mocha Nhật nguyên vị", beverage2);
        System.out.println(beverage2.getDescription() + " ₫" + beverage2.cost());


    }
}
