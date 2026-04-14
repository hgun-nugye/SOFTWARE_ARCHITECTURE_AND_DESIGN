package ontap.composite_nhahang;

import java.util.ArrayList;
import java.util.List;

public class MainDish {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Cơm gà", 50000);
        Dish dish2 = new Dish("Phở bò", 40000);
        Dish dish3 = new Dish("Bún chả", 45000);
        Dish dish4 = new Dish("Bún bò Huế", 55000);

        List<AbstractDish> cb1 = new ArrayList<>();
        cb1.add(dish1);
        cb1.add(dish2);

        List<AbstractDish> cb2 = new ArrayList<>();
        cb2.add(dish3);
        cb2.add(dish4);
        cb2.add(dish4);

        Combo combo1 = new Combo("Combo 1", cb1);
        Combo combo2 = new Combo("Combo 2", cb2);
        combo2.addDish(combo1);
        System.out.println("Giá của " + combo1.name + ": " + combo1.getPrice());
        System.out.println("Giá của " + combo2.name + ": " + combo2.getPrice());

        System.out.println("\nChi tiết " + combo1.name + ":");
        combo1.display("");

        System.out.println("\nChi tiết " + combo2.name + ":");
        combo2.display("");
    }
}
