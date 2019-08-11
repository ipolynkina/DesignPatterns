package main.java.ru.ipolynkina.abstractFactory.factory;

import main.java.ru.ipolynkina.abstractFactory.keyboard.EnKeyboard;
import main.java.ru.ipolynkina.abstractFactory.keyboard.Keyboard;
import main.java.ru.ipolynkina.abstractFactory.mouse.EnMouse;
import main.java.ru.ipolynkina.abstractFactory.mouse.Mouse;
import main.java.ru.ipolynkina.abstractFactory.touchpad.EnTouchPad;
import main.java.ru.ipolynkina.abstractFactory.touchpad.TouchPad;

public class EnDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new EnTouchPad();
    }
}
