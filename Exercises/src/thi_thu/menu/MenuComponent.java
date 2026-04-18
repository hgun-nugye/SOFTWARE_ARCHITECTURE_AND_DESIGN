package thi_thu.menu;

import java.util.ArrayList;
import java.util.List;

public class MenuComponent extends Menu {
    private List<Menu> menu;
    private String nameComponent;

    public MenuComponent(String name) {
        this.nameComponent = name;
        menu = new ArrayList<>();
    }

    @Override
    public Menu addItem(Menu item) {
        menu.add(item);
        return this;
    }

    @Override
    public Menu removeItem(Menu item) {
       menu.remove(item);
       return this;
    }

    @Override
    public void print() {
        System.out.println(nameComponent);
        for (Menu m: menu){
            m.print();
        }
    }
}
