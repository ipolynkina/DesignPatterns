package main.java.ru.ipolynkina.behavioral.strategy;

import main.java.ru.ipolynkina.behavioral.strategy.sort.ReverseSort;
import main.java.ru.ipolynkina.behavioral.strategy.sort.Sort;

import java.util.Arrays;

public class StrategyApp {
    public static void main(String[] args) {

        System.out.print("data: ");
        Integer[] testArray = new Integer[] {-8, 12, 0, 35, 64, -4, 7};
        System.out.println(Arrays.toString(testArray));

        System.out.print("sort: ");
        StrategyClient client = new StrategyClient();
        client.setStrategy(new Sort());
        client.executeStrategy(testArray);

        System.out.print("reverse sort: ");
        client.setStrategy(new ReverseSort());
        client.executeStrategy(testArray);
    }
}
