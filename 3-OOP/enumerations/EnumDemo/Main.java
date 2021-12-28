
public class Main {

    public static void main(String[] args) {

        for(Day d : Day.values()) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.values()[Day.values().length - 1]);

        for(MyEnumeration1 m : MyEnumeration1.values()) {
            System.out.println(m.getRep());
        }
    }
}

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum MyEnumeration1 {

    FIRST_CONSTANT("Representation of the first constant"),
    SECOND_CONSTANT("Representation of the second constant");

    private String representation;

    // Private (only) constructor
    // can be "instantiated" only from body
    // of emumeration's class
    private  MyEnumeration1(String representation) {
        this.representation = representation;
    }

    public String getRep() {
        return this.representation;
    }
}
