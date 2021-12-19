
package algorithms;

import java.util.Enumeration;

public class Factorial {

    public static long getFactorialRecursively(int arg) {

        if(arg <= 0) return 0;
        if(arg == 1) return 1;
        return arg * getFactorialRecursively(arg - 1);
    }

    public static long getFactorialWithDoCycle(int arg) {

        if(arg <= 0) return 0;

        long result = 1;
        int _arg = arg;
        do {
            
            result *= _arg;
        } while (--_arg > 1);

        return result;
    }

    public static String[] getCalculationTypes() {

        return new String[] { "default", "recursively", "with_do_cycle" };
    }
}

