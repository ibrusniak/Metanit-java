
public class SomeClass {

    int x;
    String s;

    SomeClass() {

        this(100, "noname");
        print("SomeClass()");
    }

    SomeClass(int x) {

        this(x, "noname");
        print("SomeClass(int x)");
    }

    SomeClass(String s) {

        this(100, s);
        print("SomeClass(String s)");
    }

    SomeClass(int x, String s) {

        this.x = x;
        this.s = s;
        print("SomeClass(int x, Strign s)");
    }


    private static void print(Object o) {

        System.out.println(o);
    }
}

