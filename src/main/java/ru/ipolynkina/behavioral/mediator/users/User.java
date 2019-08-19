package main.java.ru.ipolynkina.behavioral.mediator.users;

import main.java.ru.ipolynkina.behavioral.mediator.chats.Chat;

public abstract class User {

    private Chat chat;
    private String name;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    };

    abstract public void getMessage(String message);
}
