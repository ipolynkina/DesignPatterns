package main.java.ru.ipolynkina.prototype.human;

public class HumanFactory {

    private Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    public Human makeCope() {
        return (Human) human.copy();
    }
}
