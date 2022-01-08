import java.util.Objects;

public class RecordDemo {

    public static void main(String[] args) {
        
        MyRecord m1 = new MyRecord("John", "new employee");

        toConsole(m1.hashCode());
        toConsole(m1.toString());
        toConsole(m1.getClass());

        toConsole(m1.name());
        toConsole(m1.comment());
    }

    public static void toConsole(Object o) {
        System.out.println(o);
    }
}

record MyRecord(String name, String comment) {}


