package main.java.ru.ipolynkina.creational.factoryMethod.maker;

import main.java.ru.ipolynkina.creational.factoryMethod.watch.DigitalWatch;
import main.java.ru.ipolynkina.creational.factoryMethod.watch.Watch;

public class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
