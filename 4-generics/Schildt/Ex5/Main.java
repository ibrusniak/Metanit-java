
public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java Main num1 num2 num3 ...");
            System.exit(0);
        }

        Double nums[] = new Double[args.length];

        for (int i = 0; i < args.length; i++) {
            nums[i] = Double.parseDouble(args[i]);
        }

        NumsContainer<Double> nc1 = new NumsContainer<>(nums);
        System.out.println("Average: " + nc1.average());

        NumsContainer<Integer> nc2
            = new NumsContainer<>(new Integer[] {2, 5, 9});

        System.out.println("***");

        System.out.println("Your input: " + nc1);
        System.out.println("Internal container: " + nc2);
        System.out.println("The same average? :" + nc1.sameAverage(nc2));
    }
}

class NumsContainer<T extends Number> {

    private T[] nums;

    public NumsContainer(T[] numbers) {
        nums = numbers;
    }

    public double average() {

        double sum = 0.0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }

    // Use meta-symbol argument
    public boolean sameAverage(NumsContainer<?> obj) {

        if (average() == obj.average()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        
        String s = "";
        for(T num : nums) {
            s += "[" + num + "]";
        }
        return s;
    }
}
