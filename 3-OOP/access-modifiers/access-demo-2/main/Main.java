
package main;

import static utils.StandartConsoleOutput.*;
import static utils.StandartConsoleInput.*;

import anotherPackage.*;

public class Main {

    public static void main(String[] args) {
        
        // String s = readLine();
        // printLine(s);

        new P1Class2();

        // error: s is not public in P1Class1;
        // cannot be accessed from outside package
        // printLine(new P1Class1().s);
    }
}
