package behavioral.command.order;

public class MainOrder {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();

        Chef masterChef = new Chef("Gordon Ramsay");
        IOrder order1 = new Order("Steak", 1, masterChef);
        IOrder order2 = new Order("Salad", 1, masterChef);

        waitress.takeOrders(order1);
        waitress.orderUp();
        waitress.takeOrders(order2);
        waitress.orderUp();

        Chef sousChef = new Chef("Jamie Oliver");
        IOrder order3 = new Order("Pasta", 1, sousChef);
        waitress.takeOrders(order3);
        waitress.orderUp();

    }
}
