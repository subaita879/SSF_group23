package com.example.ssfproject.model;

public class IncidentReport {
    private String reportId;
    private String type;
    private String location;
    private String details;
    private String timestamp;

    public IncidentReport(String reportId, String type, String location, String details, String timestamp) {
        this.reportId = reportId;
        this.type = type;
        this.location = location;
        this.details = details;
        this.timestamp = timestamp;
    }

    public String getReportId() {
        return reportId;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getDetails() {
        return details;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "IncidentReport{" +
                "reportId='" + reportId + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", details='" + details + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
