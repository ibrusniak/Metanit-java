
/**
 * RecordDemo
 */
public class RecordDemo {

    public static void main(String[] args) {

        Person p1 = new Person("John", 40);
        Person p2 = new Person("Alex", 0);
        Person p3 = new Person("", 0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

record Person(String name, int age) {

    Person {

        if (name == "") {
            name = "unknown";
        }
        if (age == 0) {
            age = 18;
        }
    }
}
