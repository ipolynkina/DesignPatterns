package main.java.ru.ipolynkina.behavioral.memento;

public class Save {

    private final int level;
    private final String name;

    public Save(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
