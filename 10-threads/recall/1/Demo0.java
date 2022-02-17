
public class Demo0 {

    public static void main(String[] args) {

        Thread.dumpStack();
        Thread currentThread = Thread.currentThread();
        System.out.printf("\nCurrent thread: %s\n", currentThread);
        System.out.printf(
            """

            currentThread(): %s
            getName: %s
            isAlive: %s
            isInterrupted: %s
            
            """,
            Thread.currentThread(),
            currentThread.getName(),
            currentThread.isAlive(),
            currentThread.isInterrupted()
        );

        try {
            currentThread.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Cannot start thread. Illegal state");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

