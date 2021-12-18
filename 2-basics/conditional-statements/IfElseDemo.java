


public class IfElseDemo {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        if(a < b) {
            prn("a less than b");
        }

        if(a < b) {
            prn("a less than b");
        } else {
            prn("b less than a");
        }

        if(a == b) {
            prn("a equals to b");
        } else if(a < b) {
            prn("a less to b");
        } else if(a > b) {
            prn("a grater than b");
        } else {
            /// ... some else
        }

        if(true) prn("true");
        if(!false) prn("not false");

        a = 10;
        // It is not JavaScript
        // Error: int cannot be converted to boolean
        // if(a) prn("a is not empry");
        if(a != 0) prn("a is not empty");
        
        // if(a != null) prn("a is not null");
        int f;
        // variable f might not have been initialized
        // prn(f);
    }

    private static void prn(Object o) {
        
        System.out.println(o);
    }
}

