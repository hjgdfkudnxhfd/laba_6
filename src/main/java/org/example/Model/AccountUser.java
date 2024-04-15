package org.example.Model;

public class AccountUser {
    private String login;
    private String password;
    private String email;


    public AccountUser(String login, String password, String email){
        this.login = login;
        this.password = password;
        this.email = email;

    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
}