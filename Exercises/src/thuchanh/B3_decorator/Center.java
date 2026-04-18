package thuchanh.B3_decorator;

public class Center extends LayoutDecorator{

    public Center(Widget child) { super(child); }
    @Override
    public String build() {
        return "Center for " + child.build();
    }
}
