package ontap.singleton_logger;

public class Program {
    private String id;

    public Program(String id) {
        this.id = id;
    }

    public void writeLog(String content) {
        Logger logger = Logger.getInstance();
        logger.writeLog("[" + id + "] " + content);
    }
}
