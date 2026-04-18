package thi_thu.menu;

public class MenuItem extends Menu {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Menu addItem(Menu item) {
        return null;
    }

    @Override
    public Menu removeItem(Menu item) {
        return null;
    }

    @Override
    public void print() {
        System.out.printf("Name: %s\tPrice: %.2f\n", name, price);
    }
}
