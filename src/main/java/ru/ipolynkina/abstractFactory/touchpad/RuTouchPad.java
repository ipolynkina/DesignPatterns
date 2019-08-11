package main.java.ru.ipolynkina.abstractFactory.touchpad;

public class RuTouchPad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Сдвиг на " + deltaX + "x" + deltaY);
    }
}
