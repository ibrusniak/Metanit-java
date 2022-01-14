
public interface Printable {

    public default <T> void toConsole(T object) {
        System.out.println(object);
    }

    public default <T> void toConsole() {
        System.out.println();
    }
}


