
public class Main {

    public static void main(String[] args) {
        
        Button button1 = new Button(new buttonHandler1());
        button1.click();
        button1.setNewHandler(new buttonHandler2());
        button1.click();
    }
}

interface EventHandler {

    public void execute();
}

class buttonHandler1 implements EventHandler {

    @Override
    public void execute() {
        System.out.println("buttonHandler1");
    }
}

class buttonHandler2 implements EventHandler {

    @Override
    public void execute() {
        System.out.println("buttonHandler2");
    }
}

class Button {

    private EventHandler handler;

    Button(EventHandler handler) {
        this.handler = handler;
    }

    public void click() {
        handler.execute();
    }

    public void setNewHandler(EventHandler handler) {
        this.handler = handler;
    }
}

