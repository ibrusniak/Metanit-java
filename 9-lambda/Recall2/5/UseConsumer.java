
import java.util.function.Consumer;

public class UseConsumer {

    public static void main(String[] args) {
        Human john = new Human("john");
        System.out.println(john);
        Consumer<Human> c, d;
        c = h -> h.setName(h.getName().toUpperCase());
        d = h -> h.setName(h.getName().toLowerCase());
        c.accept(john);
        System.out.println(john);
        d.accept(john);
        System.out.println(john);
    }
}

class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + name;
    }
}

