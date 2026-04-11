package com.example.ssfproject.model;

public class SecurityAlert {
    private String alertId;
    private String message;
    private String priority;
    private boolean isHandled;

    public SecurityAlert(String alertId, String message, String priority, boolean isHandled) {
        this.alertId = alertId;
        this.message = message;
        this.priority = priority;
        this.isHandled = isHandled;
    }

    public String getAlertId() {
        return alertId;
    }

    public String getMessage() {
        return message;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isHandled() {
        return isHandled;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setHandled(boolean handled) {
        isHandled = handled;
    }

    @Override
    public String toString() {
        return "SecurityAlert{" +
                "alertId='" + alertId + '\'' +
                ", message='" + message + '\'' +
                ", priority='" + priority + '\'' +
                ", isHandled=" + isHandled +
                '}';
    }
}
