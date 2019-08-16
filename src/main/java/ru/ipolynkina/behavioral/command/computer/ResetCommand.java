package main.java.ru.ipolynkina.behavioral.command.computer;

public class ResetCommand implements Command {

    private Computer computer;

    public ResetCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
