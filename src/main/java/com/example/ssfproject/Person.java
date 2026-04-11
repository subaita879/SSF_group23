package com.example.ssfproject;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String name, gender, nId, age;
    private LocalDate dob;
    private String designation;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    private boolean isActive;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Person(String name, String gender, String nId, String age, LocalDate dob, String designation, boolean isActive) {
        this.name = name;
        this.gender = gender;
        this.nId = nId;
        this.age = age;
        this.dob = dob;
        this.designation = designation;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", nId='" + nId + '\'' +
                ", age='" + age + '\'' +
                ", dob=" + dob +
                ", designation='" + designation + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
