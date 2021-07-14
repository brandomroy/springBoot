package com.cykj.bean;

/**
 * @version 1.0
 * @author: Roy
 * @date: 2021/7/12 18:56
 * @desc:
 */
public class Menu {
//    菜单选项ID
    private int menuid;
    //    菜单名字
    private String  menuname;
//    菜单级别,对菜单分级进行记录，1级菜单，2级菜单。。。
    private String order;
//    菜单父级
    private int parentid;
//    菜单的访问url,通过该url才能访问菜单的内容
    private String menu_url;

    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuid=" + menuid +
                ", menuname='" + menuname + '\'' +
                ", order='" + order + '\'' +
                ", parentid=" + parentid +
                ", menu_url='" + menu_url + '\'' +
                '}';
    }
}
