package ontap.singleton_logger;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private List<LogItem> logs;

    private Logger(){
        this.logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void writeLog(String content){
        logs.add(new LogItem(LocalTime.now(), content));
    }

    public void printLog() {
        for (LogItem item : logs) {
            System.out.println(item);
        }
    }
}
