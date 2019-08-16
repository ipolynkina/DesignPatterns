package main.java.ru.ipolynkina.behavioral.chain.logger;

public class EmailLogger extends Logger {

    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("email: " + message);
    }
}
