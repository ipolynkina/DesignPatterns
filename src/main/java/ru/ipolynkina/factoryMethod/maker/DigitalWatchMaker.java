package main.java.ru.ipolynkina.factoryMethod.maker;

import main.java.ru.ipolynkina.factoryMethod.watch.DigitalWatch;
import main.java.ru.ipolynkina.factoryMethod.watch.Watch;

public class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
