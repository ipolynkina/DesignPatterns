package main.java.ru.ipolynkina.facade;

public class FacadeApp {
    public static void main(String[] args) {

        Computer computer = new Computer(new Power(), new DVDRom(), new HDD());
        computer.copy();
    }
}
