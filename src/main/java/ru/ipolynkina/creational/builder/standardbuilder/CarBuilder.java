package main.java.ru.ipolynkina.creational.builder.standardbuilder;

import main.java.ru.ipolynkina.creational.builder.car.Car;
import main.java.ru.ipolynkina.creational.builder.car.Transmission;

public abstract class CarBuilder {

    private Car car = new Car();

    public Car getCar() {
        return car;
    }

    public void setMake(String make) {
        car.setMake(make);
    }

    public void setTransmission(Transmission transmission) {
        car.setTransmission(transmission);
    }

    public void setMaxSpeed(int maxSpeed) {
        car.setMaxSpeed(maxSpeed);
    }

    public abstract void buildMake();
    public abstract void buildTransmission();
    public abstract void buildMaxSpeed();
}
