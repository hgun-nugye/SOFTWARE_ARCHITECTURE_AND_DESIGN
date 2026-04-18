package thuchanh.A6;

public class MainSanPham {
    public static void main(String[] args) {
        UI ui1 = new UI("UI1");
        UI ui2 = new UI("UI2");
        UI ui3 = new UI("UI3");

        SanPham sp1 = new SanPham("SP01", "Laptop", 1500.0, 10);
        SanPham sp2 = new SanPham("SP02", "Phone", 800.0, 20);
        SanPham sp3 = new SanPham("SP03", "Tablet", 600.0, 15);

        ui1.userInputAdd(sp1);
        ui2.userInputAdd(sp2);
        ui3.userInputAdd(sp3);

        ui1.showAll();

        ui2.userInputDelete(sp2);
        ui3.showAll();
    }
}
