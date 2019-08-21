package main.java.ru.ipolynkina.behavioral.strategy;

import main.java.ru.ipolynkina.behavioral.strategy.sort.Sorting;

public class StrategyClient {

    private Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(Integer[] array) {
        strategy.sort(array);
    }
}
