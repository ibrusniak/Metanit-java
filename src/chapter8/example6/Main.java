package chapter8.example6;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {100, 23, 3, 76, 32, 3, 0, 39, 300};
        dododoSmth(array, x -> x % 2 == 0, x -> println(x));
    }
    private static void dododoSmth(int[] array, Functional f, Doer<Integer> doer) {
        for(int i : array) {
            if(f.isEven(i))
                doer.doTmth(i);
        }
    }
}