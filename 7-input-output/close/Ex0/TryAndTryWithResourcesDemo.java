
import java.io.*;
import java.util.logging.Logger;

public class TryAndTryWithResourcesDemo {

    private static Logger logger =
        Logger.getAnonymousLogger();

    public static void main(String[] args) {
    
        demonstrateOpenStreamRegularSyntax();
        demonstrateOpenStreamTryCatchResources();
    }

    public static void demonstrateOpenStreamRegularSyntax() {

        final String FILE_NAME = "doesNotExixts.tmp";
        File file = new File(FILE_NAME);
        FileReader fileReader1 = null;

        try {
            fileReader1 = new FileReader(FILE_NAME);
            logger.info("file reader stream created with file: " + FILE_NAME);
        } catch (Exception e) {
            logger.severe("coudn't create stream with file: " + FILE_NAME);
            e.printStackTrace();
        }

        if (fileReader1 != null) {

            try {
                fileReader1.close();
                logger.info("file reader stream closed");
            } catch (Exception e) {
                logger.severe("coudn't close file reader stream");
                e.printStackTrace();
            }
        } else {
            logger.info("file reader stream does not need to be closed");
        }
    }

    public static void demonstrateOpenStreamTryCatchResources() {

        final String FILE_NAME = "doesNotExixts.tmp";
        File file = new File(FILE_NAME);

        try (FileReader fileReader = new FileReader(file)) {
            logger.info("File stream opened");
        } catch (Exception e) {
            logger.severe("Could not open file reader stream");
            e.printStackTrace();
        }
    }
}


