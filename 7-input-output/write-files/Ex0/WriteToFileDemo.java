import java.io.*;

public class Program {

    public static void main(String[] args) {

        String s = "Hello hello hello\n\n\n";
        
        try (FileOutputStream fos = new FileOutputStream("myFile.txt", true)) {
            fos.write(s.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


