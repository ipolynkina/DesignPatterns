package main.java.ru.ipolynkina.factoryMethod.maker;

import main.java.ru.ipolynkina.factoryMethod.watch.RomeWatch;
import main.java.ru.ipolynkina.factoryMethod.watch.Watch;

public class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
