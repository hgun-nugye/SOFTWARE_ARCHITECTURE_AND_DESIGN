package ontap.observer_thoitiet;

public class Main {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        data.thongBao();

        data.addDisplay(new PhoneDisplay());
        data.setData(30.5, 70);

        data.addDisplay(new WebDisplay());
        data.setData(28, 75);
    }
}
