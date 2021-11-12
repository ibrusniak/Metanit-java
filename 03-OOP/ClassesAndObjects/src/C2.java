
public class C2 implements PrintableClass {

    public void printInfo() {

        System.out.printf("Message from %s.printInfo(): %s\n", this.getClass().getName(), this.hashCode());
    }
}

