/**
 * Demonstrates interesting thing:
 * 111 / (1 + 1 + 1) = 37
 * 222 / (2 + 2 + 2) = 37
 * ...
 * 999 / (9 + 9 + 9) = 37
 */
public class Curiosity {

    public static void main(String[] args) {

        int number = 1;

        System.out.println();

        do {
            int divident
                = Integer.parseInt(Integer.toString(number).repeat(3));
            int divider = number + number + number;
            System.out.printf("\t%1$5s / (%2$s + %2$s + %2$s) = %1s / %3$2s = %4$s\n",
                divident,
                number,
                divider,
                divident / divider);
        } while (++number != 10);
    }
}

