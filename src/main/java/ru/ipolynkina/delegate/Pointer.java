package main.java.ru.ipolynkina.delegate;

public class Pointer {

    private Graphics graphics;

    Pointer() {
        graphics = new Square();
    }

    Pointer(Graphics graphics) {
        this.graphics = graphics;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw() {
        graphics.draw();
    }
}
