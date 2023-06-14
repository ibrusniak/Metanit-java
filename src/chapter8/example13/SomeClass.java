package chapter8.example13;

import static util.Console.*;

class SomeClass {

    public Object doSmth() {
        int x = 100;

        class LoclalClass1 {
            
            public void printInfo() {
                println("Here!");
            }

            public void changeX() {
                //  error: local variables referenced from an inner
                // class must be final or effectively final
                // x += 2;
            }
        }
        return new LoclalClass1();
    }
}