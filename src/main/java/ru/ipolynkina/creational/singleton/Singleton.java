package main.java.ru.ipolynkina.creational.singleton;

public class Singleton {

    private static volatile Singleton instance;
    private static int counter = 0;

    private Singleton(){
        counter++;
    };

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}
