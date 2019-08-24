package main.java.ru.ipolynkina.structural.bridge.car;

import main.java.ru.ipolynkina.structural.bridge.maker.Maker;

public class Sedan extends Car {

    public Sedan(Maker maker) {
        super(maker);
    }

    @Override
    String getCarType() {
        return "Sedan";
    }
}
