package main.java.ru.ipolynkina.abstractFactory.touchpad;

public class EnTouchPad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Shift by " + deltaX + "x" + deltaY);
    }
}
