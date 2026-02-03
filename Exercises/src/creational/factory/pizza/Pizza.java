package creational.factory.pizza;

public abstract class Pizza {
    StringBuilder sb = new StringBuilder();
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    @Override
    public String toString() {
        return sb.toString();
    }

    public StringBuilder getBuilder() {
        return sb;
    }
}
