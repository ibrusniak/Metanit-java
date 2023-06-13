package chapter8.example1;

import static util.Console.*;

public class Main2 {
    public static void main(String[] args) {
        Operationable op1 = new Operationable(){
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        printf("op1.getClass().getName(): %s%n", op1.getClass().getName());
        Operationable op2 = new Addition();
        printf("op2.getClass().getName(): %s%n", op2.getClass().getName());
        Operationable op3 = (f, q)-> {
            // just for example
            int d = f + 10;
            int r = q - 2;
            return r * d;
        };
        printf("op3.getClass().getName(): %s%n", op3.getClass().getName());
    }
}

// Output:
// op1.getClass().getName(): chapter8.example1.Main2$1
// op2.getClass().getName(): chapter8.example1.Addition
// op3.getClass().getName(): chapter8.example1.Main2$$Lambda$5/0x0000000801001218

// 'chapter8.example1.Main2$$Lambda$5/0x0000000801001218' - hm...