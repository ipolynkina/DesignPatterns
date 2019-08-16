package main.java.ru.ipolynkina.structural.command.computer;

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
