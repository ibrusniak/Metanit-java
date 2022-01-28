
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.logging.Logger;

public class RedirectStreamDemo {

    private static final Logger LOGGER = Logger.getAnonymousLogger();

    public static void main(String[] args) {

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.writeBytes("Test redirect".getBytes());

        byte temp[] = bos.toByteArray();

        String s = "";
        for (byte b : temp) {
            s += b + " ";
        }

        LOGGER.info("bos content: " + s);

        File file = new File("tempraryFile.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {

                LOGGER.severe("couldn't create new empty file!");
                e.printStackTrace();
                return;
            }
        }

        FileOutputStream fos = null;

        try {

            fos = new FileOutputStream(file);
            bos.writeTo(fos);
        } catch (Exception e) {

            LOGGER.severe("couldn't open file output stream!");
            e.printStackTrace();
            return;
        }

        if (fos != null) {

            try {
                fos.close();
            } catch (Exception e) {

                LOGGER.severe("couldn't close file output stream!");
                e.printStackTrace();
            }
        }
    }
}
