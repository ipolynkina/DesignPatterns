package main.java.ru.ipolynkina.abstractFactory.factory;

import main.java.ru.ipolynkina.abstractFactory.keyboard.Keyboard;
import main.java.ru.ipolynkina.abstractFactory.mouse.Mouse;
import main.java.ru.ipolynkina.abstractFactory.touchpad.TouchPad;

public interface DeviceFactory {

    Mouse getMouse();
    Keyboard getKeyboard();
    TouchPad getTouchPad();
}
