package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;
import creational.factory.pizza.PizzaStore;
import creational.factory.pizza.PizzaType;

public class VietNamPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type){
            case HAISAN:
                return new HaiSanPizza();
            case PHOMAI:
                return new PhoMaiPizza();
        }
        return null;
    }

    @Override
    public Pizza orderPizza(PizzaType type) {
        return super.orderPizza(type);
    }
}
