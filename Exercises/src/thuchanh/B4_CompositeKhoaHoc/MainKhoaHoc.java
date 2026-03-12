package thuchanh.B4_CompositeKhoaHoc;

public class MainKhoaHoc {
    public static void main(String[] args) {
        NhomHocTap hk1 = new NhomHocTap("Học kỳ 1");
        MonHoc mon1 = new MonHoc("Toán 1", 3, 620000);
        MonHoc mon2 = new MonHoc("Vật lý đại cương", 3, 620000);
        MonHoc mon3 = new MonHoc("Hóa học đại cương", 3, 500000);
        hk1.them(mon1);
        hk1.them(mon2);
        hk1.them(mon3);
        System.out.println(hk1.lietKe(""));

        NhomHocTap hk2 = new NhomHocTap("Học kỳ 2");
        MonHoc mon4 = new MonHoc("Toán 2", 3, 620000);
        MonHoc mon5 = new MonHoc("Nhập môn lập trình", 3, 600000);
        MonHoc mon6 = new MonHoc("Cơ sở dữ liệu", 3, 450000);
        hk2.them(mon4);
        hk2.them(mon5);
        hk2.them(mon6);
        System.out.println(hk2.lietKe(""));

        NhomHocTap nam1 = new NhomHocTap("Năm 1");
        nam1.them(hk1);
        nam1.them(hk2);
        System.out.println(nam1.lietKe(""));
    }
}
