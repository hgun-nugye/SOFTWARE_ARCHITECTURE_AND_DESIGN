package thi_thu.menu;

public class MainMenu {
    public static void main(String[] args) {
        Menu item1 = new MenuItem("Mi Y", 25000.0);
        Menu item2 = new MenuItem("Ga ran", 35000.0);
        Menu item3 = new MenuItem("Pepsi", 35000.0);

        Menu c1 = new MenuComponent("combo1");
        Menu c2 = new MenuComponent("combo2");

        c1.addItem(item1);
        c1.addItem(item2);
        c2.addItem(item1);
        c2.addItem(item2);
        c2.addItem(item3);

        c1.print();
        c2.print();
    }
}
