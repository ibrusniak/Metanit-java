
package utils;

import static utils.ConsoleOutput.*;

public class Logger {

    private String loggerName;
    private Long messageNumber;
    /**
     * messageFormat - describes format of all loging messages
     * [loggerName][messageNumber][timeStamp][level]: message
     */
    private String messageFormat = "[%s][%s][%s][%s]: %s\n";
    
    private static enum level {
        INFO,
        WARN,
        ERR
    }

    public Logger(String loggerName) {

        this.loggerName = loggerName;
        this.messageNumber = 0l;

        this.info("Logger created");
    }

    public void info(String message) {
        
        printf(messageFormat, loggerName,
            messageNumber, currentTimeStampString(), Logger.level.INFO, message);
        messageNumber++;
    }

    public void warning(String message) {

        printf(messageFormat, loggerName,
            messageNumber, currentTimeStampString(), Logger.level.WARN, message);
        messageNumber++;
    }

    public void error(String message) {

        printf(messageFormat, loggerName,
            messageNumber, currentTimeStampString(), Logger.level.ERR, message);
        messageNumber++;
    }

    private String currentTimeStampString() {

        java.sql.Timestamp timeStamp =
            new java.sql.Timestamp(new java.util.Date().getTime());
        String srtRepresentation = timeStamp.toLocalDateTime().toString();
        return srtRepresentation;
    }
}

