package main.java.ru.ipolynkina.behavioral.state;

import main.java.ru.ipolynkina.behavioral.state.radio.RadioMoscow;

public class StateApp {
    public static void main(String[] args) {

        Radio radio = new Radio();
        radio.play();

        radio.nextStation();
        radio.play();

        radio.setStation(new RadioMoscow());
        radio.play();
    }
}
