
import java.io.*;
import java.sql.Date;

/**
 * ConsoleOut
 */
public class ConsoleOut {

    public static void main(String[] args) {

        PrintStream standartOutputStream = System.out;
        PrintStream standartErrorStream = System.err;

        try {
            standartOutputStream.println(File.createTempFile("tmp", ".txt").getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }

        File f = new File("tempFile1.txt");
        
        try {
            PrintStream streamToFile = new PrintStream(f);
            streamToFile.println("New line");
        } catch (Exception e) {
            e.printStackTrace();
        }

        standartOutputStream.println("message 1");
        standartErrorStream.println("message 2");

        // use 'format' string
        standartOutputStream.printf("Date is: %1$tY-%1$tm-%1$td\n", new Date(System.currentTimeMillis()));

        standartOutputStream.printf("first = %3$f ,second = %2$f ,third = %1$f\n\n", 3f, 2f, 1f);

        standartOutputStream.printf("HEX of %1$d is %1$x\n\n", 15);

        try {
            DataOutputStream dataOutputStream = new DataOutputStream(standartOutputStream);
            dataOutputStream.writeLong(455l); // inner representation
        } catch (Exception e) {
            e.printStackTrace();
        }

        standartOutputStream.println();

        Console.out("Like .NET C#");
    }
}

class Console {

    public static void out(Object o) {
        
        System.out.println(o);
    }
}