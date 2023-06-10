package chapter2;

import java.util.Scanner;

public class UseExceptionsExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        do {
            System.out.print("Come on, try some: ");
            s = scanner.nextLine();
            try {
                int a = Integer.parseInt(s);
            } catch (java.util.UnknownFormatConversionException e) {
                System.out.printf("A. Exception \"%1\"", e.getMessage());
            } catch (java.lang.NumberFormatException e) {
                System.out.printf("B. Exception \"%1\"", e.getMessage());
            }
        } while (!s.equals("exit"));
        scanner.close();
    }
}