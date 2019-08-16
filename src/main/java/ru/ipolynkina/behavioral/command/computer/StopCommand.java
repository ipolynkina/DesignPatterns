package main.java.ru.ipolynkina.behavioral.command.computer;

public class StopCommand implements Command {

    private Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
