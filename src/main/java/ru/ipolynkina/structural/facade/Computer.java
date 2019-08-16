package main.java.ru.ipolynkina.structural.facade;

public class Computer {

    private Power power;
    private DVDRom dvd;
    private HDD hdd;

    public Computer (Power power, DVDRom dvd, HDD hdd) {
        this.power = power;
        this.dvd = dvd;
        this.hdd = hdd;
    }

    void copy() {
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
        dvd.unload();
        power.off();
    }
}
