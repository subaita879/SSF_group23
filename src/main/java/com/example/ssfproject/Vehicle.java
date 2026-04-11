package com.example.ssfproject;

import java.io.Serializable;
import java.time.LocalDate;

public class Vehicle implements Serializable {
    private String registrationId, model;
    private LocalDate dor;
    private String vehicleType;
    private String currentStatus;

    public Vehicle(String registrationId, String model, LocalDate dor, String vehicleType, String currentStatus) {
        this.registrationId = registrationId;
        this.model = model;
        this.dor = dor;
        this.vehicleType = vehicleType;
        this.currentStatus = currentStatus;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
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
                ", vehicleType='" + vehicleType + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                '}';
    }
}
