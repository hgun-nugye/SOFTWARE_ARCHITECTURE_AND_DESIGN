package thuchanh.CB4_do_ve_so;

import java.util.Random;

public class MainDoveSo {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder veSo = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            veSo.append(random.nextInt(10));
        }
        System.out.println("Vé số được tạo ngẫu nhiên: " + veSo);

        System.out.println("QUAY SỐ GIẢI BA...");
        String[] giai3Numbers = new String[3];
        StringBuilder g3 = new StringBuilder();
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i < 3; i++) {
                g3.append(random.nextInt(10));
            }
            giai3Numbers[j] = g3.toString();
             g3.setLength(0);
        }
        System.out.print("Giải 3: ");
            for (String num : giai3Numbers) {
                System.out.print(num +"\t");
            }
        PrizeChecker giai3 = new StandardPrizeChecker("Giải ba", giai3Numbers);

        System.out.println("\nQUAY SỐ GIẢI NHÌ...");
        String[] giai2Numbers = new String[2];
        StringBuilder g2 = new StringBuilder();
        for (int j = 0; j <= 1; j++) {
            for (int i = 0; i < 4; i++) {
                g2.append(random.nextInt(10));
            }
            giai2Numbers[j] = g2.toString();
             g2.setLength(0);
        }
        System.out.print("Giải 2: ");
            for (String num : giai2Numbers) {
                System.out.print(num +"\t");
            }
        PrizeChecker giai2 = new StandardPrizeChecker("Giải nhì",giai2Numbers);

        System.out.println("\nQUAY SỐ GIẢI NHẤT...");
        StringBuilder g1 = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            g1.append(random.nextInt(10));
        }

        System.out.println("Giải 1: " + g1.toString());
        PrizeChecker giai1 = new StandardPrizeChecker("Giải nhất", new String[]{g1.toString()});

        System.out.println("QUAY SỐ GIẢI ĐẶC BIỆT...");
        StringBuilder gDB = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            gDB.append(random.nextInt(10));
        }

        System.out.println("Giải đặc biệt: " + gDB.toString());
        PrizeChecker giaiDB = new StandardPrizeChecker("Giải nhất", new String[]{gDB.toString()});

        PrizeChecker giaiKK = new ConsolationPrizeChecker(gDB.toString());

        giaiDB.setNextChecker(giaiKK)
                .setNextChecker(giai1)
                .setNextChecker(giai2)
                .setNextChecker(giai3);

        System.out.println("Kiểm tra giải vé số: " + veSo);
        giaiDB.checkTicket(veSo.toString());
    }
}
