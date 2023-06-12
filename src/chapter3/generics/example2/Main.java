package chapter3.generics.example2;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Accountable<Integer> account1 = new Account<Integer>(100, 5000);
        Accountable<String> account2 = new Account<String>("101", 3000);
        println(account1);
        println(account2);
        println(account1.getId().getClass());
        println(account2.getId().getClass());
    }
}

// Output:
// chapter3.generics.example2.Account@279f2327
// chapter3.generics.example2.Account@2ff4acd0
// class java.lang.Integer
// class java.lang.String