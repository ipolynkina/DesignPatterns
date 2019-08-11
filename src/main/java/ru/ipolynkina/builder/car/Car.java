package main.java.ru.ipolynkina.builder.car;

public class Car {

    private String make;
    private Transmission transmission;
    private int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void getInfo() {
        System.out.println("make: " + make);
        System.out.println("transmission: " + transmission);
        System.out.println("max speed: " + maxSpeed);
    }
}
