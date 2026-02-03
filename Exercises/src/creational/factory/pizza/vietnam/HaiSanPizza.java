package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class HaiSanPizza extends Pizza {
    @Override
    public void prepare() {
        this.getBuilder().append("Bột mì, hải sản các loại...\n");
    }

    @Override
    public void bake() {
        this.getBuilder().append("Nướng bánh trong 15 phút ở nhiệt độ 200 độ C\n");
    }

    @Override
    public void cut() {
        this.getBuilder().append("Cắt bánh thành 6 miếng đều nhau\n");
    }

    @Override
    public void box() {
        this.getBuilder().append("Đóng bánh vào hộp giấy có in hình con cua\n");
    }
}
