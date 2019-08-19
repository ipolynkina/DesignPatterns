package main.java.ru.ipolynkina.behavioral.observer.observed;

import main.java.ru.ipolynkina.behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observed {

    private int temperature;
    private int pressure;
    private List<Observer> observers = new ArrayList<Observer>();

    public WeatherStation(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void setMeasurements(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }

    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.handleEvent(temperature, pressure);
        }
    }
}
