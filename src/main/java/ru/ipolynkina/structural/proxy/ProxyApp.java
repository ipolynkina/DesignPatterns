package main.java.ru.ipolynkina.structural.proxy;

public class ProxyApp {
    public static void main(String[] args) {

        Image image = new ProxyImage("cat.jpg");
        image.display();
    }
}
