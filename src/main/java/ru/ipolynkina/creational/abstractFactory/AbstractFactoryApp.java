package main.java.ru.ipolynkina.creational.abstractFactory;

import main.java.ru.ipolynkina.creational.abstractFactory.factory.DeviceFactory;
import main.java.ru.ipolynkina.creational.abstractFactory.factory.EnDeviceFactory;
import main.java.ru.ipolynkina.creational.abstractFactory.factory.RuDeviceFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {

        DeviceFactory factory = new EnDeviceFactory();
        factory.getKeyboard().println();
        factory.getMouse().doubleClick();
        factory.getTouchPad().track(5, 10);

        System.out.println("* * * ");
        factory = new RuDeviceFactory();
        factory.getKeyboard().print();
        factory.getMouse().click();
        factory.getTouchPad().track(15, 20);
    }
}
