
public class Main {

    public static void main(String[] args) {

        for(Day d : Day.values()) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.values()[Day.values().length - 1]);
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
