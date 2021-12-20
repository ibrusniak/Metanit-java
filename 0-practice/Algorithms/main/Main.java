
package main;

import algorithms.*;

public class Main {

    public static void main(String[] args) {
        
        Factorial f = new Factorial();

        f.setArguments(new Integer[] { 5 });

        System.out.println(f.calculate());
    }
}

