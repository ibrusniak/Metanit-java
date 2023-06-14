package chapter8.example12;

public class SomeClass {
    private int x;

    {x = 100;}

    public class SomeInnerClass {

        public int getX1() {
            return x;
        }

        public int getX2() {
            return SomeClass.this.x;
        }

        public SomeClass getOuterThis() {
            return SomeClass.this;
        }
    }

    public SomeInnerClass getSomeInnerClassInstance1() {
        return new SomeInnerClass();
    }

    public SomeInnerClass getSomeInnerClassInstance2() {
        return this.new SomeInnerClass();
    }

    public SomeClass getThis() {
        return this;
    }
}