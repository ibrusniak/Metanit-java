
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;

public class FileInputStreamDemo {

    private static final Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {

        logger.setLevel(Level.OFF);

        final String EN_FILE_NAME = "LorenIpsumEn.txt";
        final String RU_FILE_NAME = "LorenIpsumRu.txt";

        logger.info("Start JVM with -Dfile.encoding=UTF-8 if necessary");
        logger.info("EN_FILE_NAME: " + EN_FILE_NAME);
        logger.info("RU_FILE_NAME: " + RU_FILE_NAME);

        String defaultCharset = Charset.defaultCharset().toString();
        
        logger.info("JVM encoding is: " + defaultCharset);

        File file = new File(EN_FILE_NAME);

        if (file.exists()) {

            ArrayList<String> list = fromFileToStringArray(file);
            printStringArray(list);
        } else {
            logger.severe("File not found: " + EN_FILE_NAME);
        }

        System.out.println();

        file = new File(RU_FILE_NAME);

        if (file.exists()) {

            ArrayList<String> list = fromFileToStringArray(file);
            printStringArray(list);
        } else {
            logger.severe("File not found: " + RU_FILE_NAME);
        }
    }

    private static ArrayList<String> fromFileToStringArray(File file) {

        FileInputStream fis = null;
        ArrayList<String> list = new ArrayList<>(100);

        try {
            
            fis = new FileInputStream(file);
            byte[] buffer = new byte[fis.available()];

            fis.read(buffer);

            logger.info("buffer.length: " + buffer.length);

            String tmpString = "";
            for (byte currentByte : buffer) {
                char currentChar = (char) currentByte;
                String currentString = Character.toString(currentChar);
                if (currentString.equals("\n")) {
                    list.add(tmpString);
                } else {
                    tmpString += currentString;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        logger.info("list.size(): " + list.size());

        return list;
    }

    private static void printStringArray(ArrayList<String> list) {

        Iterator<String> iterator = list.iterator();

        logger.info("list.size(): " + list.size());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println();
        }
    }
}


