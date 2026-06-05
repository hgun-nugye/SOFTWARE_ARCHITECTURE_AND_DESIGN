package thuchanh.CA1_StreamData.feat_singleton;

public class Main {
    public static void main(String[] args) {
        DataAccess dataAccess = DataAccess.getInstance();

        // Tạo 2 client với tên khác nhau
        Client client1 = new Client("Client A");
        Client client2 = new Client("Client B");

        dataAccess.getStream().addListener(client1);
        dataAccess.getStream().addListener(client2);

        // Thao tác dữ liệu
        dataAccess.themMonHoc(new MonHoc("MH01", "Lập trình Java"));
        dataAccess.themMonHoc(new MonHoc("MH02", "Cơ sở dữ liệu"));
        dataAccess.capNhatMonHoc("MH02", "Hệ quản trị CSDL");
        dataAccess.xoaMonHoc("MH01");
    }
}
