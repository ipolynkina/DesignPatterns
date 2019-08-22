package main.java.ru.ipolynkina.structural.proxy;

public class ProxyImage implements Image {

    private String fileName;
    private RealImage image;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(image == null) {
            image = new RealImage(fileName);
        }
        image.display();
    }
}
