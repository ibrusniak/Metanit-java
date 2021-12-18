
public class TernaryOperatorDemo {

    public static void main(String[] args) {

        prn("2 < 3? " + (2 < 3 ? "yes" : "no"));

        byte b1 = 11;

        prn("b1 equals " +
            (b1 == 9 ? "9" : (b1 == 10 ? "10" : "*i dont know!*"))
        );
    }

    public static void prn(Object o) {
        
        System.out.println(o);
    }
}

