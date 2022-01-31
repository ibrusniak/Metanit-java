
public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        InstanceGenerator personGenerator = Person::new;
        InstanceGenerator cityGenerator = City::new;

        System.out.println(generate(personGenerator, "Sam"));
        System.out.println(generate(personGenerator, "Judy"));
        System.out.println(generate(personGenerator, "Rebecca"));
        
        System.out.println();

        System.out.println(generate(cityGenerator, "Lviv"));
        System.out.println(generate(cityGenerator, "Kyiv"));
        System.out.println(generate(cityGenerator, "Odessa"));
    }

    private static Object generate(InstanceGenerator constructor, String name) {

        return constructor.createInstance(name);
    }
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + ", name: " + name;
    }
}

class City {

    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getCityName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + ", name: " + name;
    }
}

interface InstanceGenerator {
    public Object createInstance(String name);
}


