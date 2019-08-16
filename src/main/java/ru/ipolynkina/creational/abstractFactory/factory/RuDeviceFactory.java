package main.java.ru.ipolynkina.creational.abstractFactory.factory;

import main.java.ru.ipolynkina.creational.abstractFactory.keyboard.Keyboard;
import main.java.ru.ipolynkina.creational.abstractFactory.keyboard.RuKeyboard;
import main.java.ru.ipolynkina.creational.abstractFactory.mouse.Mouse;
import main.java.ru.ipolynkina.creational.abstractFactory.mouse.RuMouse;
import main.java.ru.ipolynkina.creational.abstractFactory.touchpad.RuTouchPad;
import main.java.ru.ipolynkina.creational.abstractFactory.touchpad.TouchPad;

public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new RuTouchPad();
    }
}
