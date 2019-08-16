package main.java.ru.ipolynkina.creational.factoryMethod.maker;

import main.java.ru.ipolynkina.creational.factoryMethod.watch.RomeWatch;
import main.java.ru.ipolynkina.creational.factoryMethod.watch.Watch;

public class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
