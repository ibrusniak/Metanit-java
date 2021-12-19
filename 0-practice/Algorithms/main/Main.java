
package main;

import static algorithms.Factorial.*;

public class Main {

    public static void main(String[] args) {

        if(args == null | args.length == 0) return;

        String operation = args[0];

        if(!elementIsInArray(supportedOperation(), operation)) {

            System.out.printf("Unsupported operation [%s]\n", operation);
        } else {

            switch (operation) {

                case "factorial":

                    try {
                        int arg = Integer.parseInt(args[2]);
                        System.out.printf("[%s][%s]: ", operation, arg, getFactorialRecursively(arg));
                    } catch (Exception ex) {
                        System.out.printf("Invalid argument [%s] for operation [%s]\n", args[1], operation);
                    }
                    break;
            }

        }
    }

    public static String[] supportedOperation() {
        
        return new String[] { "factorial" };
    }

    public static boolean elementIsInArray(String[] array, String element) {

        for(String s : array)
            if(s.equals(element)) return true;
        
        return false;
    }
}

