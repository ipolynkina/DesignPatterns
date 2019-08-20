package main.java.ru.ipolynkina.behavioral.state;

import main.java.ru.ipolynkina.behavioral.state.radio.Radio7;
import main.java.ru.ipolynkina.behavioral.state.radio.RadioFM;
import main.java.ru.ipolynkina.behavioral.state.radio.RadioMoscow;
import main.java.ru.ipolynkina.behavioral.state.radio.Station;

public class Radio {

    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public Radio() {
        station = new Radio7();
    }

    public void nextStation() {
        if(station instanceof Radio7) station = new RadioFM();
        else if(station instanceof RadioFM) station = new RadioMoscow();
        else station = new Radio7();
    }

    public void play() {
        station.play();
    }
}
