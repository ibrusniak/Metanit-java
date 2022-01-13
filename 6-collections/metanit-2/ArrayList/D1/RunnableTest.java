

public interface RunnableTest {
    
    public default void showTestInfo() {
        System.out.println("*** test: " + this);
    }

    public void runTest();
}


