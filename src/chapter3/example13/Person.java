package chapter3.example13;

import java.util.Objects;

/**
 * This is typical java class
 */
public class Person implements Cloneable {
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String name() {
        return name;
    }
    int age() {
        return age;
    }
    boolean equals(Person other) {
        if(!(other instanceof Person)) return true;
        Person o = (Person)other;
        return o.name == name && o.age == age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return String.format("Person[name='%s',age='%d']",
            name, age);
    }
    public Person clone() {
        return new Person(name, age);
    }
}