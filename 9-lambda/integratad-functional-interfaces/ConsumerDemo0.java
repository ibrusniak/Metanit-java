
import java.util.function.Consumer;

public class ConsumerDemo0 {

    public static void main(String[] args) {

        Consumer<Object> prn = o -> System.out.println(o);

        Consumer<Switch> consumer1 = ConsumerDemo0::switchOn;
        Consumer<Switch> consumer2 = ConsumerDemo0::switchOff;

        Switch mySwitch = new Switch();
        prn.accept(mySwitch);
        consumer1.accept(mySwitch);
        prn.accept(mySwitch);
        consumer2.accept(mySwitch);
        prn.accept(mySwitch);
    }

    private static void switchOn(Switch sw) {
        sw.turnOn();
    }

    private static void switchOff(Switch sw) {
        sw.turnOff();
    }
}

class Switch {

    private boolean on = false;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    @Override
    public String toString() {
        return String.format(
            "[%s][%s]", super.toString(), on);
    }
}

