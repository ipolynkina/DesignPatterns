package main.java.ru.ipolynkina.creational.builder.simplebuilder;

import main.java.ru.ipolynkina.creational.builder.car.Car;
import main.java.ru.ipolynkina.creational.builder.car.Transmission;

public class SimpleCarBuilder {

    private String make = "Kalina";
    private Transmission transmission = Transmission.MANUAL;
    private int maxSpeed = 120;

    public SimpleCarBuilder buildMake(String make) {
        this.make = make;
        return this;
    }

    public SimpleCarBuilder buildTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public SimpleCarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setMake(make);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);
        return car;
    }
}
