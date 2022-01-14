

public interface RunnableTest extends Printable {
    
    public default void showTestInfo() {
        System.out.printf("*** test: %s\n", this);
    }

    public default void showTestInfo(String shortDesc) {
        System.out.printf("*** test: %s %s\n", this, shortDesc);
    }
    
    public void runTest();
}


