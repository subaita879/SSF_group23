package com.example.ssfproject;

import java.time.LocalDate;

public class Vehicle {
    private String registrationId, model;
    private LocalDate dor;

    public Vehicle(String registrationId, String model, LocalDate dor) {
        this.registrationId = registrationId;
        this.model = model;
        this.dor = dor;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDor() {
        return dor;
    }

    public void setDor(LocalDate dor) {
        this.dor = dor;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationId='" + registrationId + '\'' +
                ", model='" + model + '\'' +
                ", dor=" + dor +
                '}';
    }
}
