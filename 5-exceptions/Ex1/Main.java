
/**
 * Demonstrates `unchecked exceptions`. You don't need to
 * use 'try-catch clause' even if you call method that
 * declared with 'throws stmt'...
 * 
 * Unhandled are all exceptions:
 *  Object -> Throwable -> Exception -> Exception -> RuntimeException
 *  -> ... (all derived from RuntimeException)
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        throwSome();
    }

    public static void throwSome() throws RuntimeException {

        throw new RuntimeException();
    }
}



