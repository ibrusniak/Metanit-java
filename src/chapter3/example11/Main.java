package chapter3.example11;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        println(monday);
        println();
        for(Month m : Month.values())
            println(m);
        println();
        println(Month.MARCH.ordinal());
        println();
        for(Color c : Color.values())
            printf("Color: \"%s\", code: \"%s\"%n", c, c.getCode());
    }
}