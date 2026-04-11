package com.example.ssfproject;

import java.io.Serializable;

public class Unit implements Serializable {
    private String unitName;
    private String currentStatus;
    private String location;
    private int personnelCount;
    private String primaryObjective;

    public Unit(String unitName, String currentStatus, String location, int personnelCount, String primaryObjective) {
        this.unitName = unitName;
        this.currentStatus = currentStatus;
        this.location = location;
        this.personnelCount = personnelCount;
        this.primaryObjective = primaryObjective;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPersonnelCount() {
        return personnelCount;
    }

    public void setPersonnelCount(int personnelCount) {
        this.personnelCount = personnelCount;
    }

    public String getPrimaryObjective() {
        return primaryObjective;
    }

    public void setPrimaryObjective(String primaryObjective) {
        this.primaryObjective = primaryObjective;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "unitName='" + unitName + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", location='" + location + '\'' +
                ", personnelCount=" + personnelCount +
                ", primaryObjective='" + primaryObjective + '\'' +
                '}';
    }
}
