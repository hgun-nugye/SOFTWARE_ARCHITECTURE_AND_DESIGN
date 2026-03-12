package structural.composite.binary_tree;

public class MainCay {
    public static void main(String[] args) {
        Nut n = new NutTrong(10);
        Nut trai = new NutTrong(8);
        n.themTrai(trai);
        trai.themTrai(new NutLa(6));
        trai.themPhai(new NutLa(7));

        Nut phai = new NutTrong(12);
        n.themPhai(phai);
        phai.themTrai( new NutLa(11));
        phai.themPhai(new NutLa(13));
        n.duyet();
    }
}
