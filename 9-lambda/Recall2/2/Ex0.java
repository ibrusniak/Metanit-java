
public class Ex0 {
    
    private int a = 100;
    private static int b = 200;

    public void doSomething() {

        Operation op1 = () -> {
            a = 110; // normal
        };
    }

    public static void main(String[] args) {

        Operation op1 = () -> {
            // can not from static context
            // a = 200;
            b = 210;
        };
        op1.execute();
        System.out.println(b);
    }
}

interface Operation {
    public void execute();
}
