
public class Person {

    private String firstName, lastName;

    public Person(String firstName, String lastName) {

        setFirstName(firstName);
        setLastName(lastName);            
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

       this.lastName = lastName;
    }

    @Override
    public String toString() {

        return
            String.format("[%s] %s %s",
                hashCode(),
                lastName == "" ? "last_name_empty" : lastName,
                firstName == "" ? "first_name_empty" : firstName);
    }
}

