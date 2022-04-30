
class Ex3 {

    public static void main(String[] args) {
        System.out.println(getOp(2).execute(10));
        System.out.println(getOp(1).execute(10));
        System.out.println(getOp(3).execute(10));
    }

    public static UnaryOperation getOp(int code) {
        switch (code) {
            case 1: return n -> n * 2;
            case 2: return n -> n - 2;
            case 3: return n -> n + 2;
            default: return n -> 0;
        }
    }
}

interface UnaryOperation {
    public int execute(int arg);
}

