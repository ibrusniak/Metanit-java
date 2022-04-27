
public class Ex3 {

    public static void main(String[] args) {
        Op1 op1 = (a, b) -> a + b;
        Op1 op2 = (a, b) -> a * b;
        Op2 op3 = () -> System.out.println(200);
        final int x = 100;
        Op2 op4 = () -> System.out.println(x + 20);
        op4.exec();
        System.out.println(x);
    }
}

interface Op1 {
    public int exec(int a, int b);
}

interface Op2 {
    public void exec();
}



