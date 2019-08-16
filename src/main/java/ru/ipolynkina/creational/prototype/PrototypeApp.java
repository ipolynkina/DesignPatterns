package main.java.ru.ipolynkina.creational.prototype;

import main.java.ru.ipolynkina.creational.prototype.human.Human;
import main.java.ru.ipolynkina.creational.prototype.human.HumanFactory;

public class PrototypeApp {
    public static void main(String[] args) {

        Human original = new Human(25, "Alex");

        Human copy = (Human) original.copy();
        copy.setAge(18);
        copy.setName("Max");

        HumanFactory factory = new HumanFactory(copy);
        Human copyFactory = factory.makeCope();
        copyFactory.setAge(35);

        System.out.println(original);
        System.out.println(copy);
        System.out.println(copyFactory);
    }
}
