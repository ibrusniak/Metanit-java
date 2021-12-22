
public class Main {

    public static void main(String[] args) {
        
        Factorial fac1 = new Factorial(5);
        fac1.printArguments();
        fac1.calculate();
        fac1.printResults();
    }
}

class Operation {
    
    protected Number[] arguments;
    protected Number[] results;

    public Operation(Number n) {
        addArgument(n);
    }

    public Operation(Number... arguments) {
        addArgument(arguments);
    }

    protected void addArgument(Number[] arguments) {
        
        for(Number n : arguments) {
            addArgument(n);
        }
    }

    protected void addArgument(Number n) {

        if(arguments == null) {
            arguments = new Number[] {n};
        } else {
            Number[] newArguments = new Number[arguments.length + 1];
            for(int i = 0; i < arguments.length; i++) {
                newArguments[i] = arguments[i];
            }
            newArguments[newArguments.length - 1] = n;
            arguments = newArguments;
        }
    }

    protected Number[] getArguments() {
        return arguments;
    }

    protected void printArguments() {

        System.out.printf("[%s][arguments]: ", this.getClass().getSimpleName());
        for(Number n : arguments) {
            System.out.printf(n + " ");
        }
        System.out.print("\n");
    }

    protected Number[] getResults() {
        return results;
    }

    protected void printResults() {
        
        for(Number n : getResults()) {
            System.out.print(n + "");
        }
        System.out.print("\n");
    }

    protected void calculate() {}
}

class Factorial extends Operation {

    Factorial(Integer argument) {
        super(argument);
    }

    @Override public void calculate() {
        results = new Integer[]
            {getFactorial((Integer)arguments[0])};
    }

    private Integer getFactorial(Integer num) {
        
        Integer result = 1;
        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

