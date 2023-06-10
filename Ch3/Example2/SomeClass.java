public class SomeClass {
    private static int a;
    {
        System.out.println("static initializer");
        a++;
    }
    public static void printA() {
        System.out.printf("Current value: %d%n", a);
    }
}