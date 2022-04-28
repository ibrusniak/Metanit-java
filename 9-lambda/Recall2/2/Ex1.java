
public class Ex1 {

    public static void main(String[] args) {

        int x = 100;
        int y = 200;

        Operation op = () -> {
            // local variables referenced from
            // a lambda expression must be final or effectively final
            // x = 110;
            System.out.println(x + 20);
        };
        op.execute();
        y = 210;
        System.out.println(210);
        System.out.println(x);
        // local variables referenced from
        // a lambda expression must be final or effectively final
        // x += 30;
    }    
}

interface Operation {
    public void execute();
}
