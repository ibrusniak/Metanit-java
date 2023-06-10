package chapter3;

import static util.Console.*;

public class UtilTester {
    public static void main(String[] args) {
        print("\"static print\" function from \"util.Console\"");
        println();
        printf("This is %s%s \"%s\"%n", "just another static", " function from", "util.Console");
    }
}