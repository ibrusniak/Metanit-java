import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

public class TryWithResources {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        String fileName = String.format("testFile%s", rnd.nextInt(1025));
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        FileOutputStream fos = new FileOutputStream(file);
        DataInputStream dis = new DataInputStream(System.in);
        
        String input = "";

        while (input != "halt") {

            input = dis.readUTF();
        }

        fos.close();
        dis.close();
    }
}



