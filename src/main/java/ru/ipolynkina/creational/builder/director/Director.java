package main.java.ru.ipolynkina.creational.builder.director;

import main.java.ru.ipolynkina.creational.builder.car.Car;
import main.java.ru.ipolynkina.creational.builder.standardbuilder.CarBuilder;

public class Director {

    private CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        return builder.getCar();
    }
}
