
public class Ex1 {

    public static void main(String[] args) {

        FunctionalInterface f1 = new FunctionalInterface() {
            public void doSmth() {}
        };
        System.out.println(f1);
        FunctionalInterface f2 = () -> {};
        System.out.println(f2);
    }
}

interface FunctionalInterface {
    public void doSmth();
}

