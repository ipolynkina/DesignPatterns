package main.java.ru.ipolynkina.behavioral.memento;

public class Game {

    private int level;
    private String name;

    public Game(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public void load(Save save) {
        level = save.getLevel();
        name = save.getName();
    }

    public Save save() {
        return new Save(level, name);
    }

    @Override
    public String toString() {
        return "game: " + name + ", level: " + level;
    }
}
