package ontap.composite_nhahang;

import java.util.List;

public class Combo extends AbstractDish {
    String name;
    List<AbstractDish> listDish;

    public Combo(String name, List<AbstractDish> dishItem) {
        this.name = name;
        this.listDish = dishItem;
    }

    @Override
    public void addDish(AbstractDish dish) {
        listDish.add(dish);
    }

    @Override
    public void removeDish(AbstractDish dish) {
        listDish.remove(dish);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
       for(AbstractDish dish: listDish){
           totalPrice+=dish.getPrice();
       }
       return totalPrice;
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + "[COMBO] " + name + " - " + getPrice());

        for (AbstractDish dish : listDish) {
            if (dish instanceof Combo) {
                dish.display(prefix + "   ");
            } else {
                dish.display(prefix + "   ");
            }
        }
    }
}
