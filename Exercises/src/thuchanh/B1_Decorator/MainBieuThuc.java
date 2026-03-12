package thuchanh.B1_Decorator;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc bt1 = new BieuThucDonGian(6);
        bt1 = new Cong(bt1,9);
        bt1 = new Nhan(bt1, 8);
        bt1 = new Cong(bt1, 5);
        System.out.println(bt1.bieuThuc() + " = " + bt1.giaTri());

        BieuThuc bt2 = new BieuThucDonGian(8);
        bt2 = new Cong(bt2, 6);
        bt2= new Chia(bt2, 2);
        bt2 = new Nhan(bt2, 5);
        bt2 = new Cong(bt2, 8);
        bt2 = new Tru(bt2, 4);
        System.out.println(bt2.bieuThuc() + " = " + bt2.giaTri());

        BieuThuc bt3 = new BieuThucDonGian(2);
        bt3 = new Cong(bt3, 5);
        bt3 = new Nhan(bt3, 3);
        System.out.println(bt3.bieuThuc() + " = " + bt3.giaTri());


    }
}
