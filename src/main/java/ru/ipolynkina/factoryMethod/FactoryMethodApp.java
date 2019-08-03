package main.java.ru.ipolynkina.factoryMethod;

import main.java.ru.ipolynkina.factoryMethod.maker.DigitalWatchMaker;
import main.java.ru.ipolynkina.factoryMethod.maker.RomeWatchMaker;
import main.java.ru.ipolynkina.factoryMethod.maker.WatchMaker;
import main.java.ru.ipolynkina.factoryMethod.watch.Watch;

public class FactoryMethodApp {
    public static void main(String[] args) {

        WatchMaker maker = new DigitalWatchMaker();
        Watch watch = maker.createWatch();
        watch.showTime();

        maker = new RomeWatchMaker();
        watch = maker.createWatch();
        watch.showTime();
    }
}
