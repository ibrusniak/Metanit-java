
/**
 * Demonstrates generic constructor in Java
 * 
 */
public class Main {

    public static void main(String[] args) {

        DoubleArray d1 = new DoubleArray(new Integer[]{2, 3, 4});
        DoubleArray d2 = new DoubleArray(new Short[]{4, 2, 3});
        DoubleArray d3 = new DoubleArray(new Double[]{5.0, 2d, 7.023});

        System.out.println(d1 + ", average: " + d1.getAverage());
        System.out.println(d2 + ", average: " + d2.getAverage());
        System.out.println(d3 + ", average: " + d3.getAverage());
    }
}

class DoubleArray {

    private Double[] array;

    public <T extends Number> DoubleArray(T[] array) {

        this.array = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i].doubleValue();
        }
    }

    public Double getAverage() {

        Double summ = 0d;
        for (Double d : array) {
            summ += d;
        }
        return summ / array.length;
    }

    @Override
    public String toString() {
        
        String s = "";
        for (Double d : array) {
            s += "[" + d.toString() + "]";
        }
        return s;
    }
}

