import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        Parrent[] parrentArray = new Parrent[3];

        parrentArray[0] = new Parrent();
        parrentArray[1] = new Child();
        parrentArray[2] = new ChildOfTheChild();

        for(Parrent p : parrentArray) {
            p.doSomeThing();
        }

        for(Parrent p : parrentArray) {
            ((Parrent)p).doSomeThing();
        }

        Parrent p = new Child();
        p.doSomeThing();

        Child c = new Child();
        ((Parrent)c).doSomeThing();
    }
}

class Parrent {

    public void doSomeThing() {
        System.out.printf("[%s]\n", this.getClass().getName());
    }
}

class Child extends Parrent {

    public @Override void doSomeThing() {
        System.out.printf("[%s]\n", this.getClass().getName());
    }
}

class ChildOfTheChild extends Child {

    public @Override void doSomeThing() {
        System.out.printf("[%s]\n", this.getClass().getName());
    }
}

