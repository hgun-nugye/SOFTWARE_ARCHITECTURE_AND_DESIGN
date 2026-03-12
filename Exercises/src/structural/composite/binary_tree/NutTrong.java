package structural.composite.binary_tree;

public class NutTrong extends Nut{
    Nut trai;
    Nut phai;

    public NutTrong(int giaTri) {
        super(giaTri);
    }

    @Override
    public void duyet() {
        System.out.println(giaTri);
        if(trai!=null){
            this.trai.duyet();
        }
        if(phai!=null) {
            this.phai.duyet();
        }
    }

    @Override
    public void themTrai(Nut n) {
        this.trai = n;
    }

    @Override
    public void themPhai(Nut n) {
        this.phai = n;
    }

    @Override
    public void xoaTrai() {
        this.trai = null;
    }

    @Override
    public void xoaPhai() {
        this.phai = null;
    }
}
