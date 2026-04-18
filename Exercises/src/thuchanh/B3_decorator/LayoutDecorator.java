package thuchanh.B3_decorator;

public abstract class LayoutDecorator implements Widget {
    protected Widget child;

    public LayoutDecorator(Widget child) {
        this.child = child;
    }

   public abstract String build();
}
