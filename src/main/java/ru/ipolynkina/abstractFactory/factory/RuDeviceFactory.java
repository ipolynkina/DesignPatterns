package main.java.ru.ipolynkina.abstractFactory.factory;

import main.java.ru.ipolynkina.abstractFactory.keyboard.Keyboard;
import main.java.ru.ipolynkina.abstractFactory.keyboard.RuKeyboard;
import main.java.ru.ipolynkina.abstractFactory.mouse.Mouse;
import main.java.ru.ipolynkina.abstractFactory.mouse.RuMouse;
import main.java.ru.ipolynkina.abstractFactory.touchpad.RuTouchPad;
import main.java.ru.ipolynkina.abstractFactory.touchpad.TouchPad;

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
