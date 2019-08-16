package main.java.ru.ipolynkina.behavioral.chain.logger;

public abstract class Logger {

    private int priority;
    private Logger nextLogger;

    public void writeMessage(String message, int errorLevel) {
        if(errorLevel <= getPriority()) {
            write(message);
        }
        if(getNextLogger() != null) {
            getNextLogger().writeMessage(message, errorLevel);
        }
    }

    abstract protected void write(String message);

    public Logger(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Logger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
