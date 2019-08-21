package main.java.ru.ipolynkina.behavioral.strategy.sort;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSort implements Sorting {

    @Override
    public void sort(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
