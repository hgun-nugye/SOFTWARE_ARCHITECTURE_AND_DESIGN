package behavioral.command.order;

public class Order implements IOrder {
    String foodName;
    int quantity;
    Chef chef;

    public Order(String foodName, int quantity, Chef chef) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.chef = chef;
    }

    @Override
    public void order() {
        chef.cook(foodName);
    }
}
