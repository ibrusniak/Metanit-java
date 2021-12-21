
package classes;

import static utils.Printer.*;

public class OuterClass1 {

    private int value = 0;

    public OuterClass1(int value) {

        this.value = value;
    }

    // Nested "regular" class (Inner class)
    public class InnerClass1 {
        
        public void printValueFromOuterObject() {

            // Special syntax to access to
            // members of outer class
            println(OuterClass1.this.value);
        }
    }
    
    // Static nested class
    public static class StaticNestedClass1 {


    }
}

