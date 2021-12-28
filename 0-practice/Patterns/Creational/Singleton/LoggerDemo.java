import javax.xml.stream.events.StartDocument;

public class LoggerDemo {

    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger();
    }
}

final class Logger {

    private Logger() {};

    private static Logger logger;

    public static Logger getLogger() {

        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}

