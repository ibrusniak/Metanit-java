
/**
 * Demo3.java Demonstrates generic interface implementation
 * and inharitance from generic class at the same time
 */
public class Demo3 {

    public static void main(String[] args) {
        
        ChildClass1<Integer> obj1 =
            new ChildClass1<>(165);

        System.out.println(obj1.getDouble());
    }
}

interface GenericInterface<E extends Number> {

    public Double getDouble();
}

class GenericParrentClass<T> {

    protected T variable;

    public GenericParrentClass(T variable) {
        this.variable = variable;
    }

    protected void printSomething() {
        System.out.println("something");
    }

    public T getVariable() {
        return variable;
    }
}

class ChildClass1<T extends Number> extends GenericParrentClass<T>
            implements GenericInterface {

    public ChildClass1(T variable) {
        super(variable);
    }

    public Double getDouble() {
        return variable.doubleValue();
    }
}


