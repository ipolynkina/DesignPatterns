package main.java.ru.ipolynkina.structural.command;

import main.java.ru.ipolynkina.structural.command.computer.Computer;
import main.java.ru.ipolynkina.structural.command.computer.ResetCommand;
import main.java.ru.ipolynkina.structural.command.computer.StartCommand;
import main.java.ru.ipolynkina.structural.command.computer.StopCommand;

public class CommandApp {
    public static void main(String[] args) {

        Computer computer = new Computer();
        User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));
        user.startComputer();
        user.resetComputer();
        user.stopComputer();
    }
}
