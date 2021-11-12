
public class C1 implements PrintableClass {

    public void printInfo() {

        System.out.printf("Message from %s.printInfo(): %s\n", this.getClass().getName(), this.hashCode());
    }
}

