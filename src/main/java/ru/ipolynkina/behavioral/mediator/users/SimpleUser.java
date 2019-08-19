package main.java.ru.ipolynkina.behavioral.mediator.users;

import main.java.ru.ipolynkina.behavioral.mediator.chats.Chat;

public class SimpleUser extends User {

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(getName() + " get a message: " + message);
    }
}
