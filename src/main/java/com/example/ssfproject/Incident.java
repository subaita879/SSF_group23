package com.example.ssfproject;

import java.io.Serializable;
import java.time.LocalDate;

public class Incident implements Serializable {
    private LocalDate date;
    private String incidentId;
    private String incidentStatus;
    private String location;
    private String incidentDescription;

    public Incident(LocalDate date, String incidentId, String incidentStatus, String location, String incidentDescription) {
        this.date = date;
        this.incidentId = incidentId;
        this.incidentStatus = incidentStatus;
        this.location = location;
        this.incidentDescription = incidentDescription;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getIncidentStatus() {
        return incidentStatus;
    }

    public void setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "date=" + date +
                ", incidentId=" + incidentId +
                ", incidentStatus='" + incidentStatus + '\'' +
                ", location='" + location + '\'' +
                ", incidentDescription='" + incidentDescription + '\'' +
                '}';
    }
}
