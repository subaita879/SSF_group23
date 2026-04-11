package com.example.ssfproject.model;

public class VisitorLog {
    private String visitorName;
    private String idType;
    private String entryTime;
    private String purpose;

    public VisitorLog(String visitorName, String idType, String entryTime, String purpose) {
        this.visitorName = visitorName;
        this.idType = idType;
        this.entryTime = entryTime;
        this.purpose = purpose;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public String getIdType() {
        return idType;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "VisitorLog{" +
                "visitorName='" + visitorName + '\'' +
                ", idType='" + idType + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
