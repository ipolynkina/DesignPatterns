package main.java.ru.ipolynkina.behavioral.mediator.users;

import main.java.ru.ipolynkina.behavioral.mediator.chats.Chat;

public class Admin extends User {

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin get a message: " + message);
    }
}
