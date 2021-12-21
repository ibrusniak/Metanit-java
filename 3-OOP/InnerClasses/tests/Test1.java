
package tests;

import static utils.Printer.*;
import classes.*;

public class Test1 implements IRunnableTest {

    public void run() {
        
        printMessageTestStarts(this);

        OuterClass1 ou1 = new OuterClass1(10);

        // To create instanse of inner class,
        // you need instance of outer class!
        OuterClass1.InnerClass1 ou1in1 =
            ou1.new InnerClass1();
        
        ou1in1.printValueFromOuterObject();
    }
}

