package main.java.ru.ipolynkina.builder;

import main.java.ru.ipolynkina.builder.car.Car;
import main.java.ru.ipolynkina.builder.car.Transmission;
import main.java.ru.ipolynkina.builder.director.Director;
import main.java.ru.ipolynkina.builder.simplebuilder.SimpleCarBuilder;
import main.java.ru.ipolynkina.builder.standardbuilder.FordBuilder;
import main.java.ru.ipolynkina.builder.standardbuilder.SubaruBuilder;

public class BuilderApp {
    public static void main(String[] args) {

        // simple builder
        Car car = new SimpleCarBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build();

        car.getInfo();

        // standard builder
        Director director = new Director();
        director.setBuilder(new FordBuilder());
        Car ford = director.buildCar();
        ford.getInfo();

        director.setBuilder(new SubaruBuilder());
        Car subaru = director.buildCar();
        subaru.getInfo();
    }
}
