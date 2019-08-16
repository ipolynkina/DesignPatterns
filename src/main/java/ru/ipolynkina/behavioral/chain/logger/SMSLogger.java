package main.java.ru.ipolynkina.behavioral.chain.logger;

public class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("sms: " + message);
    }
}
