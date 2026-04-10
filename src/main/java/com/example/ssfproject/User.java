package com.example.ssfproject;

import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String designation;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", designation='" + designation + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
