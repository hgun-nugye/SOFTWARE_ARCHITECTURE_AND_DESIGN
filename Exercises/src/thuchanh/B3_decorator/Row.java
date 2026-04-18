package thuchanh.B3_decorator;

public class Row extends LayoutDecorator{

    public Row(Widget child) {
        super(child);
    }

    @Override
    public String build() {
        return "Row for " + child.build();
    }
}
