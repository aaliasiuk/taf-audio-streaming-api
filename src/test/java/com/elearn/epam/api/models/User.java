package com.elearn.epam.api.models;

public class User {
    private String email;
    private String firstName;
    private int id;
    private String lastName;

    public User(String email,String firstName,int id,String lastName){
        this.email = email;
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
    }
}
