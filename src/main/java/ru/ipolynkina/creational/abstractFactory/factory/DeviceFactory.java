package main.java.ru.ipolynkina.creational.abstractFactory.factory;

import main.java.ru.ipolynkina.creational.abstractFactory.keyboard.Keyboard;
import main.java.ru.ipolynkina.creational.abstractFactory.mouse.Mouse;
import main.java.ru.ipolynkina.creational.abstractFactory.touchpad.TouchPad;

public interface DeviceFactory {

    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchPad();
}
