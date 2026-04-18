package thi_thu.logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger.Builder()
                .setTime(true)
                .setOutput("console")
                .build();

        logger.log("Ứng dụng khởi động", LogLevel.INFO);
        logger.log("Không tìm thấy file cấu hình", LogLevel.WARNING);
        logger.log("Lỗi kết nối cơ sở dữ liệu", LogLevel.ERROR);
    }
}
