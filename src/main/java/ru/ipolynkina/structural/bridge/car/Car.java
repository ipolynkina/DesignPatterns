package main.java.ru.ipolynkina.structural.bridge.car;

import main.java.ru.ipolynkina.structural.bridge.maker.Maker;

public abstract class Car {

    private Maker maker;

    public Car(Maker maker) {
        this.maker = maker;
    }

    public void printDetails() {
        System.out.println(maker.getMakerInfo() + ", " + getCarType());
    }

    abstract String getCarType();
}
