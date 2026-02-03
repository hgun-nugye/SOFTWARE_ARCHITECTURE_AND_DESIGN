package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class PhoMaiPizza extends Pizza {
    @Override
    public void prepare() {
        this.getBuilder().append("Bột mì, phô mai các loại...\n");
    }

    @Override
    public void bake() {
        this.getBuilder().append("Nướng bánh trong 20 phút ở nhiệt độ 180 độ C\n");
    }

    @Override
    public void cut() {
        this.getBuilder().append("Cắt bánh thành 4 miếng đều nhau\n");
    }

    @Override
    public void box() {
        this.getBuilder().append("Đóng bánh vào hộp giấy có in hình con bò\n");
    }
}
