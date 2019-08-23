package main.java.ru.ipolynkina.creational.singleton;

public class Run implements Runnable {

    @Override
    public void run() {
        Singleton.getInstance();
    }
}
