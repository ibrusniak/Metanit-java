
package utils;

import static java.lang.System.*;

import java.util.Scanner;

public class StandartConsoleInput {

    public static String readLine() {
        
        Scanner sc = new Scanner(in);

        String line = sc.nextLine();

        sc.close();

        return line;
    }
}

