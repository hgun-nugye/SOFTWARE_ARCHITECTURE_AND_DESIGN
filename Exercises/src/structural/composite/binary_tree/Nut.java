package structural.composite.binary_tree;

public abstract class Nut {
    public int giaTri;

    public Nut(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract void duyet(); //in gia tri cua nut
    public abstract void themTrai(Nut n);
    public abstract void themPhai(Nut n);
    public abstract void xoaTrai();
    public abstract void xoaPhai();
}
