package thi_thu.logger;

import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;
    private boolean time;
    private String output; // ví dụ: "console", "file"

    // private constructor
    private Logger(boolean time, String output) {
        this.time = time;
        this.output = output;
    }

    // Builder để cấu hình Logger
    public static class Builder {
        private boolean time = true;
        private String output = "console";

        public Builder setTime(boolean time) {
            this.time = time;
            return this;
        }

        public Builder setOutput(String output) {
            this.output = output;
            return this;
        }

        public Logger build() {
            if (Logger.instance == null) {
                Logger.instance = new Logger(time, output);
            }
            return Logger.instance;
        }
    }

    // phương thức log với mức độ
    public void log(String message, LogLevel level) {
        String prefix = "[" + level + "]";
        String timestamp = time ? LocalDateTime.now() + " " : "";
        String output = prefix + " " + timestamp + message;

        if ("console".equals(this.output)) {
            System.out.println(output);
        } else {
            // giả sử ghi ra file (demo)
            System.out.println("Write to file: " + output);
        }
    }
}



