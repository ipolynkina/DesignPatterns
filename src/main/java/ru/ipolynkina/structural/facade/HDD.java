package main.java.ru.ipolynkina.structural.facade;

public class HDD {

    void copyFromDVD(DVDRom dvd) {
        if(dvd.hasData()) {
            System.out.println("copying date");
        } else {
            System.out.println("insert disk");
        }
    }
}
