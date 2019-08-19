package main.java.ru.ipolynkina.behavioral.mediator;

import main.java.ru.ipolynkina.behavioral.mediator.chats.TextChat;
import main.java.ru.ipolynkina.behavioral.mediator.users.Admin;
import main.java.ru.ipolynkina.behavioral.mediator.users.SimpleUser;

public class MediatorApp {
    public static void main(String[] args) {

        TextChat textChat = new TextChat();

        Admin admin = new Admin(textChat, "Admin");
        SimpleUser marya = new SimpleUser(textChat, "Marya");
        SimpleUser max = new SimpleUser(textChat, "Max");

        textChat.setAdmin(admin);
        textChat.addUser(marya);
        textChat.addUser(max);

        marya.sendMessage("hi, i'm Marya");
        admin.sendMessage("i'm admin");
    }
}
