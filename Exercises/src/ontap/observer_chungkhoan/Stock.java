package ontap.observer_chungkhoan;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private double price;
    private List<Investor> dsNhaDauTu = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addNDT(Investor ndt){
        dsNhaDauTu.add(ndt);
    }
    public void removeNDT(Investor ndt){
        dsNhaDauTu.remove(ndt);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyNDT();
    }

    public void notifyNDT(){
        for(Investor n:dsNhaDauTu){
            n.notify(name, price);
        }
    }
}
