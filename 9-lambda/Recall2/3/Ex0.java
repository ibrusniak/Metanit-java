
public class Ex0 {

    public static void main(String[] args) {
        Check check1 = x -> true; // Elements count!
        Check check2 = x -> x < 0;
        Check check3 = x -> x == 0;
        Check check4 = x -> false; // 0
        int[] array = { 2, -1, 0, 5, -3, 0, 4, 6, 1, -4 };
        Printer printer = o -> System.out.println(o);
        
        // Pretty syntax!
        printer.push(elementsCount(array, check1));
        printer.push(elementsCount(array, check2));
        printer.push(elementsCount(array, check3));
        printer.push(elementsCount(array, check4));

        // !!! Another way
        printer.push(elementsCount(array, o -> o == -3));
        printer.push(elementsCount(new int[] {2, 3, 4}, o -> o >= 3));
    }

    static int elementsCount(int[] array, Check checkFunction) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (checkFunction.check(array[i]))
                count++;
        }
        return count;
    }
}

interface Check {
    boolean check(int x);
}

interface Printer {
    void push(Object o);
}

