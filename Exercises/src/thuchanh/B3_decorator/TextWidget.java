package thuchanh.B3_decorator;

public class TextWidget implements Widget {
    private String text;

    public TextWidget(String text) {
        this.text = text;
    }

    @Override
    public String build() {
        return "Text: " + text;
    }
}
