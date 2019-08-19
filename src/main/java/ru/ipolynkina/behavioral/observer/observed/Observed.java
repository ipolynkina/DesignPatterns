package main.java.ru.ipolynkina.behavioral.observer.observed;

import main.java.ru.ipolynkina.behavioral.observer.observer.Observer;

public interface Observed {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
