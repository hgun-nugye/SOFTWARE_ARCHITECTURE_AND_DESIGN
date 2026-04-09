package thuchanh.CB1_rut_tien;

public abstract class MoneyDispenser {
    protected MoneyDispenser nextDispenser;

    public MoneyDispenser setNextDispenser(MoneyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
        return this.nextDispenser;
    }

    public abstract void dispense(int amount);
}
