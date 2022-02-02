
public class MainThreadDemo {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        println(getThreadInfo(thread));

        thread.setName("new main thread name!");
        thread.setPriority(10);

        println(getThreadInfo(thread));

        try {
            println("Thread is going to sleep for 5000 ms");
            thread.sleep(5000);
            println("wake up!)");
        } catch (Exception e) {
            println("Coudn't sleep");
            e.printStackTrace();
        }

        try {
            // just for fun
            thread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        println(thread);
    }

    private static String getThreadInfo(Thread thread) {

        return String.format(
            """
            thread.getName(): %s;
            thread.getPriority(): %s;
            thread.isAlive(): %s;
            thread.isInterrupted(): %s;
            """,
            thread.getName(),
            thread.getPriority(),
            thread.isAlive(),
            thread.isInterrupted());
    }

    private static void println(Object... objects) {

        for(Object object : objects)
            System.out.println(object);
    }
}


