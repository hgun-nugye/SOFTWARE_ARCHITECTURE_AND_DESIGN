package thuchanh.CA1_StreamData;

import javax.xml.crypto.Data;

public class MainStream {
    public static void main(String[] args) {
        DataAccess dataAccess = new DataAccess();
        Client client = new Client();
        dataAccess.getStream().addListener(client);

        System.out.println("--- Thêm môn học ---");
        dataAccess.themMonHoc(new MonHoc("MH01", "Toán"));
        dataAccess.themMonHoc(new MonHoc("MH02", "Lý"));
        dataAccess.themMonHoc(new MonHoc("MH03", "Hóa"));

        System.out.println("\n--- Cập nhật môn học ---");
        dataAccess.capNhatMonHoc("MH02", "Vật Lý");
        dataAccess.capNhatMonHoc("MH03", "Hóa học");

        System.out.println("\n--- Xóa môn học ---");
        dataAccess.xoaMonHoc("MH01");
    }
}
