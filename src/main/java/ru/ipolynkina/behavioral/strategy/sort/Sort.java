package main.java.ru.ipolynkina.behavioral.strategy.sort;

import java.util.Arrays;

public class Sort implements Sorting {

    @Override
    public void sort(Integer[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
