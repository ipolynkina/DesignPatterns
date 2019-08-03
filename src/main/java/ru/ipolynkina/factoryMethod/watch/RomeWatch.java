package main.java.ru.ipolynkina.factoryMethod.watch;

import java.util.Date;

public class RomeWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
