package main.java.ru.ipolynkina.creational.factoryMethod;

import main.java.ru.ipolynkina.creational.factoryMethod.maker.DigitalWatchMaker;
import main.java.ru.ipolynkina.creational.factoryMethod.maker.RomeWatchMaker;
import main.java.ru.ipolynkina.creational.factoryMethod.maker.WatchMaker;
import main.java.ru.ipolynkina.creational.factoryMethod.watch.Watch;

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
