package main.java.ru.ipolynkina.behavioral.observer.observer;

public class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("ConsoleObserver. Temperature: " + temperature + " pressure: " + pressure);
    }
}
