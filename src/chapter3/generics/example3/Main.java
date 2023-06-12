package chapter3.generics.example3;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        ParametrizedClass pc1 = new ParametrizedClass(100);
        ParametrizedClass pc2 = new ParametrizedClass("str");
        ParametrizedClass pc3 = new ParametrizedClass(200.23D);
        // Javac:
        // Note: chapter3\generics\example3\Main.java uses unchecked or unsafe operations.
        // Note: Recompile with -Xlint:unchecked for details.
        // Javac with "-Xlint:unchecked":
        // chapter3\generics\example3\Main.java:7: warning: [unchecked] unchecked call to ParametrizedClass(T) as a member of the raw type ParametrizedClass
        // ParametrizedClass pc1 = new ParametrizedClass(100);
        // ...
        println(pc1.getF().getClass());
        println(pc2.getF().getClass());
        println(pc3.getF().getClass());
        // Output:
        // class java.lang.Integer
        // class java.lang.String
        // class java.lang.Double

        // error: incompatible types: ParametrizedClass<Integer> cannot be converted to ParametrizedClass<String>
        // ParametrizedClass<String> pc4 = new ParametrizedClass<Integer>(200);
    }
}