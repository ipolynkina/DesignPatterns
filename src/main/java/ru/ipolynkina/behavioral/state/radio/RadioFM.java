package main.java.ru.ipolynkina.behavioral.state.radio;

public class RadioFM implements Station {

    @Override
    public void play() {
        System.out.println("RadioFM is playing . . . ");
    }
}
