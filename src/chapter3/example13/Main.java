package chapter3.example13;

import static util.Console.*;

public class Main {
    public static void main(String[] args) {
        Person mary = new Person("Mary", 20);
        Person tom = new Person("Tom", 22);
        Person maryCopy = mary.clone();
        println(mary);
        println(tom);
        println(maryCopy);
        printf("mary.equals(tom): %s%n", mary.equals(tom));
        printf("tom.equals(mary): %s%n", tom.equals(mary));
        printf("mary.equals(maryCopy): %s%n", mary.equals(maryCopy));
        printf("maryCopy.equals(mary): %s%n", maryCopy.equals(mary));
        println();
        Person2 nancy = new Person2("Nancy", 25);
        Person2 rudger = new Person2("Rudger", 30);
        Person2 rudger2 = new Person2("Rudger", 30);
        println(nancy);
        println(rudger);
        println(rudger2);
        printf("nancy.equals(rudger): %s%n", nancy.equals(rudger));
        printf("nancy.equals(rudger2): %s%n", nancy.equals(rudger2));
        printf("rudger.equals(rudger2): %s%n", rudger.equals(rudger2));
        printf("rudger2.equals(rudger): %s%n", rudger2.equals(rudger));
    }
}

// Output:
// Person[name='Mary',age='20']
// Person[name='Tom',age='22']
// Person[name='Mary',age='20']
// mary.equals(tom): false
// tom.equals(mary): false
// mary.equals(maryCopy): true
// maryCopy.equals(mary): true

// Person2[name=Nancy, age=25]
// Person2[name=Rudger, age=30]
// Person2[name=Rudger, age=30]
// nancy.equals(rudger): false
// nancy.equals(rudger2): false
// rudger.equals(rudger2): true
// rudger2.equals(rudger): true
