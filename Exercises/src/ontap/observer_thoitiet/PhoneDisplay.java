package ontap.observer_thoitiet;

public class PhoneDisplay implements IObserver {
    private WeatherData data;

    @Override
    public void thongBao(double nhietDo, double doAm) {
        System.out.println("[PhoneDisplay] Nhiet do: " + nhietDo + " Do am: " + doAm +"%");

    }
}
