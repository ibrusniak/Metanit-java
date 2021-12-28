
import java.time.LocalDateTime;

public class LoggerDemo {

    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger();

        System.out.println("\nTest3: level = OFF\n");

        logger.info("info test");
        logger.warning("warning test");
        logger.error("error test");

        System.out.println("\nTest1: level = ERROR\n");

        logger.setLoggingLevel(Logger.Level.ERROR);
        logger.info("info test");
        logger.warning("warning test");
        logger.error("error test"); // +

        System.out.println("\nTest2: level = WARNING\n");

        logger.setLoggingLevel(Logger.Level.WARNING);
        logger.info("info test");
        logger.warning("warning test"); // +
        logger.error("error test"); // +

        System.out.println("\nTest3: level = INFO\n");

        logger.setLoggingLevel(Logger.Level.INFO);
        logger.info("info test"); // +
        logger.warning("warning test"); // +
        logger.error("error test"); // +


    }
}

final class Logger {

    private Logger() {};

    private static Logger logger;
    private final String MASSAGE_PATTERN = "[%s][%s] %s\n";

    private Logger.Level level =
        Logger.Level.OFF;

    public static Logger getLogger() {

        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public enum Level {
        OFF,
        ERROR,
        WARNING,
        INFO
    }

    public void setLoggingLevel(Logger.Level level) {
        this.level = level;
    }

    public void info(String message) {

        if(level == Logger.Level.INFO) {
            System.out.printf(MASSAGE_PATTERN, Logger.Level.INFO, getTimeStamp(), message);
        }
    }

    public void warning(String message) {

        if(level.ordinal() >= Logger.Level.WARNING.ordinal()) {
            System.out.printf(MASSAGE_PATTERN, Logger.Level.WARNING, getTimeStamp(), message);
        }
    }

    public void error(String message) {

        if(level.ordinal() >= Logger.Level.ERROR.ordinal()) {
            System.out.printf(MASSAGE_PATTERN, Logger.Level.ERROR, getTimeStamp(), message);
        }
    }

    private String getTimeStamp() {
        return LocalDateTime.now().toString();
    }
}

