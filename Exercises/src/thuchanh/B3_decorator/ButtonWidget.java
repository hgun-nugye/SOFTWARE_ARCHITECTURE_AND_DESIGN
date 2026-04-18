package thuchanh.B3_decorator;

public class ButtonWidget implements Widget {
    private String label;

    public ButtonWidget(String label) {
        this.label = label;
    }

    @Override
    public String build() {
        return "Label: " + label;
    }
}
