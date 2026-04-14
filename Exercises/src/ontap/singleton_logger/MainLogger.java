package ontap.singleton_logger;

public class MainLogger {
    public static void main(String[] args) {
        Program p1 = new Program("Module A");
        Program p2 = new Program("Module B");

        p1.writeLog("Đăng nhập thành công");
        p2.writeLog("Tạo đơn hàng");
        p1.writeLog("Đăng xuất");

        Logger.getInstance().printLog();
    }
}
