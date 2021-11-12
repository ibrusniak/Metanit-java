
public class NestedInner1 {

    public static void main(String[] args) {

        new C1().doWork(10, 20).showInfo();
    }
}

class C1 {

    public C1.C1Result doWork(int a, int b) {

        return new C1Result(a, b, a * b);
    }

    public class C1Result {
        
        private int arg1, arg2, result;

        public C1Result(int arg1, int arg2, int result) {

            this.arg1 = arg1;
            this.arg2 = arg2;
            this.result = result;
        }

        public void showInfo() {

            System.out.printf("arg1 = %s, arg2 = %s, arg3 = %s", arg1, arg2, result);
        }
    }
}

