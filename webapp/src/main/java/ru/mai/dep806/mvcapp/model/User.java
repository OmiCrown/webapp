package ru.mai.dep806.mvcapp.model;

import java.util.Date;

/**
 * Created by Omicrown on 04.06.2015.
 */
public class User {
    private long id;
    private String name;
    private String login;
    private String email;
    private Date birthDate;
    private boolean active;

    public User(String name, String login, String email, Date birthDate, boolean active) {
        this.name = name;
        this.login = login;
        this.email = email;
        this.birthDate = birthDate;
        this.active = active;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
