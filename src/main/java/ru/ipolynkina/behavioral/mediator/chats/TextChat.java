package main.java.ru.ipolynkina.behavioral.mediator.chats;

import main.java.ru.ipolynkina.behavioral.mediator.users.Admin;
import main.java.ru.ipolynkina.behavioral.mediator.users.User;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {

    private Admin admin;

    private List<User> users = new ArrayList<User>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User currentUser) {
        if(!(currentUser instanceof Admin)) {
            admin.getMessage(message);
        }

        for(User user : users) {
            if(!user.equals(currentUser)) {
                user.getMessage(message);
            }
        }
    }
}
