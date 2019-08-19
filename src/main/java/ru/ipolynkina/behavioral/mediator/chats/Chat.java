package main.java.ru.ipolynkina.behavioral.mediator.chats;

import main.java.ru.ipolynkina.behavioral.mediator.users.User;

public interface Chat {

    void sendMessage(String message, User user);
}
