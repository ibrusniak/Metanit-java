
public class GenDemo0 {

    public static void main(String[] args) {
        // Create a Gen reference for Integers
        Gen<Integer> iOb;

        // Create a Gen<Integer> object and assign its
        // reference to iOb. Notice the use of autoboxing
        // to encaplusate the value 88 within an Integer object.
        iOb = new Gen<Integer>(88);

        // Show the type of data used by iOb
        iOb.showType();

        // Get the value in iOb. Notice that
        // no cast is needed.
        int v = iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String>("Generic test");

        // Show the data of type used by strOb.
        strOb.showType();

        // Get the value of strOb. Again, notice
        // that no cast is needed.
        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}

// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class Gen<T> {

    private T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T
    public Gen(T o) {
        ob = o;
    }

    public T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is " +
            ob.getClass().getName());
    }
}


