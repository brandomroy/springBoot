package com.cykj.bean;

/**
 * @version 1.0
 * @author: Roy
 * @date: 2021/7/9 17:10
 * @desc:
 */
public class User {
    private String username;
    private String pwd;
    private int userid;
    private String sex;
    private String age;
    //    权限id
    private int power;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", userid=" + userid +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", power=" + power +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
