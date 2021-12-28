
public class LoggerDemo {

    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger();
    }
}

final class Logger {

    private Logger() {};

    private static Logger logger;

    private Logger.Level level =
        Logger.Level.OFF;

    public static Logger getLogger() {

        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public enum Level {
        INFO,
        WARNING,
        ERROR,
        OFF
    }
}

