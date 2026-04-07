package behavioral.command.order;

public class Waitress {
    IOrder order;
    void takeOrders(IOrder order) {
        this.order = order;
    }

    void orderUp(){
        order.order();
    }
}
