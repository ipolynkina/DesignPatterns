package main.java.ru.ipolynkina.behavioral.memento;

public class MementoApp {
    public static void main(String[] args) {

        Game wow = new Game(15, "wow");
        System.out.println(wow);

        System.out.println("save . . .");
        File file = new File(wow.save());

        wow = new Game(25, "test-wow");
        System.out.println(wow);

        System.out.println("load . . .");
        wow.load(file.getSave());
        System.out.println(wow);
    }
}
