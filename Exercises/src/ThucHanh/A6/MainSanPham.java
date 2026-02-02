package ThucHanh.A6;

import java.util.Scanner;

public class MainSanPham {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IDataAccess dataAccess = DataAccessImpl.getInstance();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xem danh sách sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    add(sc, dataAccess);
                    break;

                case 2:
                    delete(sc, dataAccess);
                    break;

                case 3:
                    update(sc, dataAccess);
                    break;

                case 4:
                    getAll(dataAccess);
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void add(Scanner sc, IDataAccess dataAccess) {
        System.out.print("Mã SP: ");
        String maSP = sc.nextLine();

        System.out.print("Tên SP: ");
        String tenSP = sc.nextLine();

        System.out.print("Đơn giá: ");
        double donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        SanPham sp = new SanPham(maSP, tenSP, donGia, soLuong);
        dataAccess.add(sp);
    }

    private static void delete(Scanner sc, IDataAccess dataAccess) {
        System.out.print("Nhập mã SP cần xóa: ");
        String maSP = sc.nextLine();
        dataAccess.delete(maSP);
    }

    private static void update(Scanner sc, IDataAccess dataAccess) {
        System.out.print("Mã SP cần cập nhật: ");
        String maSP = sc.nextLine();

        boolean check = false;
        for(SanPham sp : dataAccess.getAll()){
            if(!sp.getMaSP().equalsIgnoreCase(maSP)){
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Sản phẩm với mã " + maSP + " không tồn tại.");
            return;
        }

        System.out.print("Tên mới: ");
        String tenSP = sc.nextLine();

        System.out.print("Đơn giá mới: ");
        double donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Số lượng mới: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        SanPham sp = new SanPham(maSP, tenSP, donGia, soLuong);
        dataAccess.update(sp);
    }

    private static void getAll(IDataAccess dataAccess) {
        if(dataAccess.getAll().isEmpty()){
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        System.out.println("\n\t\t--- DANH SÁCH SẢN PHẨM ---");
        for (SanPham sp : dataAccess.getAll()) {
            System.out.println(sp);
        }
    }
}
