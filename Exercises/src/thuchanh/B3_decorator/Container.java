package thuchanh.B3_decorator;

public class Container extends LayoutDecorator {
    private String color;

    public Container(Widget child, String color) {
        super(child);
        this.color = color;
    }

    @Override
    public String build() {
        return "Container color " + color + " for " + child.build();
    }
}
