package com.cykj.bean;

import java.util.List;

/**
 * @version 1.0
 * @author: Roy
 * @date: 2021/7/13 8:49
 * @desc:
 */
public class ReturnMsg {
    private  String type;
    private  String username;
    private  List<Menu> menu;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "ReturnMsg{" +
                "type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", menu=" + menu +
                '}';
    }
}
