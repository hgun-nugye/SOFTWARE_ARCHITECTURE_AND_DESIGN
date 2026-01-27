package creational.builder;

public class MainComputer {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setScreen("15.6 inch")
                .build();

        System.out.println(myComputer);
    }
}
