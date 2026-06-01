package ontap.observer_thoitiet;

public class WebDisplay implements IObserver {
    private WeatherData data;

    @Override
    public void thongBao(double nhietDo, double doAm) {
        System.out.println("[WebDisplay] Nhiet do: " + nhietDo + " Do am: " + doAm +"%");

    }
}
