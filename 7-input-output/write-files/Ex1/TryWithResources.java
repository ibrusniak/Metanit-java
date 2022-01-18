
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.stream.Stream;

public class TryWithResources {

    public static void main(String[] args) {

        Random rnd = new Random();
        String fileName = String.format("testFile%s", rnd.nextInt(1025));
        File file = new File(fileName);
        Scanner scanner = new Scanner(System.in);

        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String input = "";

        try (FileOutputStream fos = new FileOutputStream(file)) {

            while (!input.equals("exit")) {

                input = scanner.nextLine();
                String stringToWrite = input + "\n";
                fos.write(stringToWrite.getBytes());
            }
        } catch (Exception ex) {

            ex.printStackTrace();
            System.exit(0);
        }

    }
}


