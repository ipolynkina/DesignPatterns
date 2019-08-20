package main.java.ru.ipolynkina.behavioral.template.helper;

public abstract class Helper {

    public void help() {
        hello();
        giveHint();
        bye();
    }

    private void hello() {
        System.out.println("Hello, user");
    }

    protected abstract void giveHint();

    private void bye() {
        System.out.println("Bye, user");
    }
}
