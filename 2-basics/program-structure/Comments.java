
// One line comment

/*
    This is multiline
        comment...
*/

public class Comments {

    public static void main(String... args) {
     
        Integer v = 100;

        for(Integer i = 0; i < 10; i++) {
            -- /* comment */ v;
        }

        System /* comment */.out.println(v);
    }
}

// comment one line
