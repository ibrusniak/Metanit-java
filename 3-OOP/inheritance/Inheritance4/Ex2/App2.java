
public class App2 {

    public static void main(String[] args) {

        ParentClass pc1 = new ParentClass();

        // We can access the protectd member in the same
        // package even if it is in another file
        System.out.println(pc1.protectedMember);
    }
}
