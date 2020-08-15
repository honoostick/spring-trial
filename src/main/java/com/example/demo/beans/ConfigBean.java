package com.example.demo.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "project.global")
public class ConfigBean {
    private String guest;
    private String welcome;

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public String isGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getNotExist() {
        return notExist;
    }

    public void setNotExist(String notExist) {
        this.notExist = notExist;
    }

    private String notExist;
}
