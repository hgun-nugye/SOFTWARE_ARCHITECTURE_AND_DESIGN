package ontap.observer_thoitiet;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private List<IObserver> dsDisplay = new ArrayList<>();
    private double nhietDo;
    private double doAm;

    public void addDisplay(IObserver observer){
        dsDisplay.add(observer);
    }

    public void removeDisplay(IObserver observer){
        dsDisplay.remove(observer);
    }

    public void setData(double nhietDo, double doAm){
        this.nhietDo = nhietDo;
        this.doAm = doAm;
        thongBao();
    }

    public void thongBao(){
        if(dsDisplay.isEmpty()){
            System.out.println("Khong co noi de hien thi thong tin");
            return;
        }
        for(IObserver ob: dsDisplay){
            ob.thongBao(nhietDo, doAm);
        }
    }

}
