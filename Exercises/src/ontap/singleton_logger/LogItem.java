package ontap.singleton_logger;

import java.time.LocalTime;

public class LogItem {
    private LocalTime logTime;
    private String logContent;

    public LogItem(LocalTime logTime, String logContent) {
        this.logTime = logTime;
        this.logContent = logContent;
    }

    @Override
    public String toString() {
        return "[" + logTime + "] " + logContent;
    }
}
