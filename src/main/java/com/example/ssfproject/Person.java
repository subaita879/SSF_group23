package com.example.ssfproject;

import java.time.LocalDate;

public class Person {
    private String name, gender, nId, age;
    private LocalDate dob;

    public Person(String name, String gender, String nId, String age, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.nId = nId;
        this.age = age;
        this.dob = dob;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", nId='" + nId + '\'' +
                ", age='" + age + '\'' +
                ", dob=" + dob +
                '}';
    }
}
