
public class Ex2 {

    public static void main(String[] args) {
        Iface l1, l2;
        l1 = () -> System.out.println("lambda 1");
        l2 = () -> System.out.println("lambda 2");
        l1.execute();
        l2.execute();
        Iface temp = l2;
        l2 = l1;
        l1 = temp;
        l1.execute();
        l2.execute();
    }
}

interface Iface {
    public void execute();
}

