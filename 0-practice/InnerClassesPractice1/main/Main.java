
package main;

import static utils.Printer.*;

import classes.*;

public class Main {

    public static void main(String[] args) {
        
        Operations.Factorial f = Operations.getFactorial(5);
        println(f.getResult());
    }
}

