package main.java.ru.ipolynkina.structural.bridge.car;

import main.java.ru.ipolynkina.structural.bridge.maker.Maker;

public class Hatchback extends Car {

    public Hatchback(Maker maker) {
        super(maker);
    }

    @Override
    String getCarType() {
        return "Hatchback";
    }
}
