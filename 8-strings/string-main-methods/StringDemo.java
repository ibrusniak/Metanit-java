
public class StringDemo {

    public static void main(String[] args) {

        String string1 = "String 1";
        String string2 = "String 2";
        String string3 = new String();
        String string4 = new String(new char[]{'S', 't', 'r', 'i', 'n', 'g', ' ', '3'});
        
        println(string1);
        println(string2);
        println(string3);
        println(string4);
    }

    private static void println(Object o) {
        System.out.println(o);
    }
}

