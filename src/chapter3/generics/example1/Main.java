package chapter3.generics.example1;

import static util.Console.*;

public class Main {
    public static void main(String args[]) {
        Account<String> account1 = new Account<String>("3343455563", Currency.UAH, 200);
        Account<Long> account2 = new Account<Long>(3343455564l, Currency.USD, 50);
        println(account1);
        println(account2);
        println(account1.getId().getClass());
        println(account2.getId().getClass());
    }
}

// Output:
// chapter3.generics.example1.Account@279f2327
// chapter3.generics.example1.Account@2ff4acd0
// class java.lang.String
// class java.lang.Long

