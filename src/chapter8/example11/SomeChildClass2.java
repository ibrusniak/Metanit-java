package chapter8.example11;

class SomeChildClass2 extends SomeClass2.StaticNestedClass1 {
    private int y;

    public SomeChildClass2(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }
}