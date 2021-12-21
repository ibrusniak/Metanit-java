
package main;

import tests.*;

public class Main {

    public static void main(String[] args) {
        
        IRunnableTest[] tests  = new IRunnableTest[] {
            new Test1(),
            new Test2(),
            new Test3()
        };

        for(IRunnableTest t : tests) t.run();
    }
}

