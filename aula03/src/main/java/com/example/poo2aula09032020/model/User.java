package com.example.poo2aula09032020.model;

/**
 * User
 */
public class User {

    private String login;
    private String name;
    private String pwd;

    public User(String login, String name, String pwd) {
        this.login = login;
        this.name = name;
        this.pwd = pwd;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User [login=" + login + ", name=" + name + ", pwd=" + pwd + "]";
    }

    
    


    
    
}