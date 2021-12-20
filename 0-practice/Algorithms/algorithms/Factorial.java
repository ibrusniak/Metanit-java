
package algorithms;

public class Factorial extends Algorithm <Integer> implements ICalculable <Long> {

    public Long calculate() {

        return factorial(arguments[0]);
    }

    private Long factorial(Integer base) {

        if(base < 1)
            throw new IllegalArgumentException("Base cannot be under 1");

        if(base == 1) return 1l;
        return base * factorial(base - 1);
    }
}

