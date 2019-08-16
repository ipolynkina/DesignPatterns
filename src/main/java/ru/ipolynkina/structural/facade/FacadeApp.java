package main.java.ru.ipolynkina.structural.facade;

public class FacadeApp {
    public static void main(String[] args) {

        Computer computer = new Computer(new Power(), new DVDRom(), new HDD());
        computer.copy();
    }
}
