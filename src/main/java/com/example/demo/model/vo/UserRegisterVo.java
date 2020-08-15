package com.example.demo.model.vo;

import java.util.List;

/**
 * <p>
 * 用户注册入参
 * </p>
 *
 * @author strk2333
 * @since 2020-08-14
 */

public class UserRegisterVo {
    private String account;
    private String password;
    private int userSource;
    private int registerSource;
    private int id;
    private int name;
    private int age;
    private double money;
    private String others;

    @Override
    public String toString() {
        return "UserRegisterVo{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", userSource=" + userSource +
                ", registerSource=" + registerSource +
                ", id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", money=" + money +
                ", others='" + others + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserSource() {
        return userSource;
    }

    public void setUserSource(int userSource) {
        this.userSource = userSource;
    }

    public int getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(int registerSource) {
        this.registerSource = registerSource;
    }

}
