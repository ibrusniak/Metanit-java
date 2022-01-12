
public class Demo1 {

    public static void main(String[] args) {

        SimpleGenericClass<Double> obj1
            = new SimpleGenericClass<>(2.356d);
        GenericClassWithTwoParameters<Double, String> obj2
            = new GenericClassWithTwoParameters<>(9.81, "Gravity");

        System.out.print(obj1);
        System.out.print(obj2);

        System.out.println();

        SimpleImplementator1 obj3 =
            new SimpleImplementator1(978);
        
        obj3.showTypeInfo(obj3.getVariable());
    }
}

/**
 * Simple generic class
 */
class SimpleGenericClass<T> {

    private T variable;

    public SimpleGenericClass(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return String.format("[%s@%s variable = %s]\n",
                getClass().getName(), hashCode(), variable);
    }
}

/**
 * Simple generic class with two parameters
 */
class GenericClassWithTwoParameters<T, V> {

    private T variable1;
    private V variable2;

    public GenericClassWithTwoParameters(T var1, V var2) {
        this.variable1 = var1;
        this.variable2 = var2;
    }

    public T getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public void setVariable1(T variable1) {
        this.variable1 = variable1;
    }

    public void setVariable2(V variable2) {
        this.variable2 = variable2;
    }

    @Override
    public String toString() {
        return String.format("[%s@%s variable1 = %s, variable2 = %s]\n",
                getClass().getName(), hashCode(), variable1, variable2);
    }
}

/**
 * Generic interface
 */
interface GenericInterface<T> {

    public default void showTypeInfo(T variable) {
        System.out.printf("[%s@%s] value = %s", variable.getClass().getName(),
            variable.hashCode(),
            variable);
    }
}

/**
 * Strategy 1. Simple class implements generic interface
 * with specified type (specific version of generic interface)
 */
class SimpleImplementator1 implements GenericInterface<Integer> {

    private Integer variable;

    SimpleImplementator1(Integer variable) {
        this.variable = variable;
    }

    @Override
    public void showTypeInfo(Integer variable) {
        GenericInterface.super.showTypeInfo(variable);
    }

    public Integer getVariable() {
        return variable;
    }
}


