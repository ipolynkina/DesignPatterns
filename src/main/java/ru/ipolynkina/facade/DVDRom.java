package main.java.ru.ipolynkina.facade;

public class DVDRom {

    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    public void load() {
        data = true;
        System.out.println("disk is load");
    }

    public void unload() {
        data = false;
        System.out.println("disk is unload");
    }
}
