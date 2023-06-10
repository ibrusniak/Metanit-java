package chapter3.innerclassesdemo;

import static util.Console.*;

public class SomeClass {
    private String str;
    
    SomeClass(String s) {
        str = s;
    }
    public void printStr() {
        printf("[%s] str: \"%s\"%n", this, str);
    }
    public class Nested1 {
        public void changeOuterStr(String s) {
            SomeClass.this.str = s;
        }
    }
    private class Nested2 {

    }
    public Nested2 getNested2Instance() {
        return new SomeClass.Nested2();
    }
}
