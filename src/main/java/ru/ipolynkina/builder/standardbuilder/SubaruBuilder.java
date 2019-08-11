package main.java.ru.ipolynkina.builder.standardbuilder;

import main.java.ru.ipolynkina.builder.car.Transmission;

public class SubaruBuilder extends CarBuilder {
    @Override
    public void buildMake() {
        setMake("Subaru");
    }

    @Override
    public void buildTransmission() {
        setTransmission(Transmission.MANUAL);
    }

    @Override
    public void buildMaxSpeed() {
        setMaxSpeed(320);
    }
}
