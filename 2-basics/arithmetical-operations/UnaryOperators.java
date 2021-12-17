

public class UnaryOperators {

    public static void main(String[] args) {
        
        // +, -, ++, --, !
        Integer f = 10;

        print(f);
        print(+f);
        print(-f);

        emptyLine();

        print(f);
        print(++f);
        print(f);

        emptyLine();
        f = 10;

        print(f);
        print(f++);
        print(f);

        emptyLine();
        f = 10;
        print(f);
        print(f += 1);
        f = 10;
        print(f -= 1);

        Boolean b = true;
        print(!b);

        emptyLine();
        print(!(10 == 2));
    }

    public static void emptyLine() {
        
        System.out.println();
    }

    public static <T> void print(T message) {
        
        System.out.println(message);
    }
}
