package thuchanh.CA1_StreamData;

import java.util.ArrayList;
import java.util.List;

public class Stream <T>{
    private List<Listener<T>> listeners = new ArrayList<>();

    public void addListener(Listener<T> listener) {
        listeners.add(listener);
    }

    public void addEvent(T t){
        for(Listener<T> l:listeners){
            l.update(t);
        }
    }
}
