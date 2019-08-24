package main.java.ru.ipolynkina.structural.bridge;

import main.java.ru.ipolynkina.structural.bridge.car.Car;
import main.java.ru.ipolynkina.structural.bridge.car.Hatchback;
import main.java.ru.ipolynkina.structural.bridge.car.Sedan;
import main.java.ru.ipolynkina.structural.bridge.maker.Kia;
import main.java.ru.ipolynkina.structural.bridge.maker.Mazda;

public class BridgeApp {
    public static void main(String[] args) {

        Car car = new Hatchback(new Kia());
        car.printDetails();

        car = new Sedan(new Mazda());
        car.printDetails();
    }
}
