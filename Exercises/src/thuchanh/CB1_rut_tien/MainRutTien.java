package thuchanh.CB1_rut_tien;

import java.util.Scanner;

public class MainRutTien {
    public static void main(String[] args) {
        int amountToWithraw = 871;
        System.out.println("Rút tiền: " + amountToWithraw + " đồng");
        System.out.println("--Câu a: Rút tiền bình thường (Mệnh giá lớn nhất là 500)");
        MoneyDispenser defaultChain = ATM.getDispenserChain(500);
        defaultChain.dispense(amountToWithraw);

        System.out.println("\n--Câu b: Rút tiền với mệnh giá lớn nhất được chọn");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mệnh giá lớn nhất muốn rút (1,10, 50, 100, 500): ");
        int maxDenomination = sc.nextInt();
        MoneyDispenser customChain = ATM.getDispenserChain(maxDenomination);
        customChain.dispense(amountToWithraw);
    }
}
