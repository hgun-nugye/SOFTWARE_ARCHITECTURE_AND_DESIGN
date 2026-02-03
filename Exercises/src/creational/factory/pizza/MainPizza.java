package creational.factory.pizza;

import creational.factory.pizza.vietnam.VietNamPizzaStore;

public class MainPizza{
    public static void main(String[] args) {
        PizzaStore p = new VietNamPizzaStore();
        Pizza pizza = p.orderPizza(PizzaType.PHOMAI);
        System.out.println(pizza);
    }
    // vẽ lại sơ đồ cho đúng với cấu trúc code
}
