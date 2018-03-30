package com.pnakaj.pattern.solid.srp.badCode;

/**
 * Created by pankaj on 3/28/2018.
 */
public class User {
   private String name;
   private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
