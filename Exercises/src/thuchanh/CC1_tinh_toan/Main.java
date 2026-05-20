package thuchanh.CC1_tinh_toan;

public class Main {
    public static void main(String[] args) {
        Context con = new Context();
//        System.out.println("10 + 5 = " + con.tinh(10,5));

        con.setTinhToan(new Cong());
        System.out.println("10 + 5 = " + con.tinh(10,5));
        con.setTinhToan(new Tru());
        System.out.println("28 - 129 = " + con.tinh(28,129));
        con.setTinhToan(new Nhan());
        System.out.println("29 * 11 = " + con.tinh(29,11));
        con.setTinhToan(new Chia());
        System.out.println("28 / 7 = " + con.tinh(28,7));

        System.out.println("\nTest chia cho 0");
        con.setTinhToan(new Chia());
        System.out.println("10 / 5 = " + con.tinh(10,0));

    }
}
