
public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("", "Brusniak");
        Utils.println(p1);

        TelephoneStorage storage = new TelephoneStorage();

        storage.add(p1);
        storage.add(new Person("Doe", "John"));
        storage.add(new Person("Parker", "Cris"));

        storage.print();

        Utils.println(storage.find(p1));

        p1.setFirstName("Ivan");

        storage.print();
    }    
}

