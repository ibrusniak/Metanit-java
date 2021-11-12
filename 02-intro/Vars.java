
public class Vars {

    public static void main(String... args) {

        int x;
        int y, z;
        int a = 20, b = 30, c = 10;

        var q = 25;
        var f = "Hello";
        // var o; // cannot use 'var' on variable without initializer

        final var PI = 3.14;
        System.out.println(PI);

        // PI = 10; // cannot assign a value to final variable PI
    }
}

