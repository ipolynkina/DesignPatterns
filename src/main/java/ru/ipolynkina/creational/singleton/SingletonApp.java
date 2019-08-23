package main.java.ru.ipolynkina.creational.singleton;

/**
 *  Singleton violates SRP (Single Responsibility Principle)
 */
public class SingletonApp {

    private static final int SIZE = 1_000;

    public static void main(String[] args) throws InterruptedException {

        Thread thread[] = new Thread[SIZE];
        for(int i = 0; i < SIZE; i++) {
            thread[i] = new Thread(new Run());
            thread[i].start();
        }

        for(int i = 0; i < SIZE; i++) {
            thread[i].join();
        }

        System.out.println("counter: " + Singleton.getCounter());
    }
}
