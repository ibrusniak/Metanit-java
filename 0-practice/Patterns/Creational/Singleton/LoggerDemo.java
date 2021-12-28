
public class LoggerDemo {

    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger();
    }
}

final class Logger {

    private Logger() {};

    private Logger logger;

    public Logger getLogger() {

        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}

