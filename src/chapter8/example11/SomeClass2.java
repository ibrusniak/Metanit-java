package chapter8.example11;

public class SomeClass2 {

    public static class StaticNestedClass1 {
        private int x;
        
        public StaticNestedClass1(int f) {
            x = f;
        }
        
        public int getX() {
            return x;
        }
    }
}