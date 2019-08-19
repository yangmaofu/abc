package com.luan.entity;

import com.luan.model.Menu;
import com.luan.model.User;

public class SessionUser {

    private User user;
    private Menu button;
    private Menu menu;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Menu getButton() {
        return button;
    }

    public void setButton(Menu button) {
        this.button = button;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "SessionUser{" +
                "user=" + user +
                ", button=" + button +
                ", menu=" + menu +
                '}';
    }
}
