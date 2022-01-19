
import java.io.FileOutputStream;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

public class FileInputStreamDemo {

    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();

        if(args.length == 0) {
            logger.severe("Usage: java FileInputStreamDemo.java filename");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        System.out.println("\nWrite lines one at a time...\n");

        FileOutputStream fos = null;
        Scanner scanner = null;

        try {

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
            } else {
                fos = new FileOutputStream(file);
            }
            
            scanner = new Scanner(System.in, "UTF-8");
            String readedLine = "";
            while (true) {
                
                readedLine = scanner.nextLine();
                
                if (readedLine.equals("exit")) {
                    break;
                }

                readedLine += "\n";
                fos.write(readedLine.getBytes());
            };
        } catch (Exception ex) {

            logger.severe(ex.getMessage());
        } finally {
            
            if (fos != null) {

                try {
                    fos.close();
                } catch (Exception ex) {
                    logger.severe("Exception while trying to close file output stream!");
                    logger.severe(ex.getMessage());
                }

            }

            if (scanner != null) {

                try {
                    scanner.close();
                } catch (Exception ex) {
                    logger.severe("Exception while trying to close scanner!");
                    logger.severe(ex.getMessage());
                }
            }
        }
    }
}

