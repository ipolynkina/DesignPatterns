package main.java.ru.ipolynkina.structural.proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("load: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("display: " + fileName);
    }
}
