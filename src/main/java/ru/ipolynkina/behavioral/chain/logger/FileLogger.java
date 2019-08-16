package main.java.ru.ipolynkina.behavioral.chain.logger;

public class FileLogger extends Logger {

    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("file: " + message);
    }
}
