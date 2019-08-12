package main.java.ru.ipolynkina.prototype.human;

import main.java.ru.ipolynkina.prototype.Copyable;

public class Human implements Copyable {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object copy() {
        return new Human(age, name);
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }
}
