package chapter3.example3.package2;

public class Class2 {
    public Class2() {
        System.out.println("package2.Class2 instantiated.");
    }
    public Class3 createNewClass3() {
        return new Class3();
    }
}