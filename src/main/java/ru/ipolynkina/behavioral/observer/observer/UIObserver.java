package main.java.ru.ipolynkina.behavioral.observer.observer;

public class UIObserver implements Observer {

    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("UIObserver. Temperature: " + temperature + " pressure: " + pressure);
    }
}
