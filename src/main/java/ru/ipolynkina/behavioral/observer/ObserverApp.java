package main.java.ru.ipolynkina.behavioral.observer;

import main.java.ru.ipolynkina.behavioral.observer.observed.WeatherStation;
import main.java.ru.ipolynkina.behavioral.observer.observer.ConsoleObserver;
import main.java.ru.ipolynkina.behavioral.observer.observer.UIObserver;

public class ObserverApp {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation(25, 760);

        weatherStation.addObserver(new ConsoleObserver());
        weatherStation.addObserver(new UIObserver());

        weatherStation.setMeasurements(27, 768);
        weatherStation.setMeasurements(30, 758);
    }
}
