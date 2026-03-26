package thuchanh.button;

import java.util.ArrayList;
import java.util.List;

public class Button {
    private List<OnClickListener> listeners = new ArrayList<>();

    public void attach(OnClickListener listener) {
        listeners.add(listener);
    }

    public void click() {
        for (OnClickListener listener : listeners) {
            listener.onClick();
        }
    }
}
