package main.java.ru.ipolynkina.builder.standardbuilder;

import main.java.ru.ipolynkina.builder.car.Transmission;

public class FordBuilder extends CarBuilder {
    @Override
    public void buildMake() {
        setMake("Ford");
    }

    @Override
    public void buildTransmission() {
        setTransmission(Transmission.AUTO);
    }

    @Override
    public void buildMaxSpeed() {
        setMaxSpeed(260);
    }
}
