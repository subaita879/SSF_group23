package com.example.ssfproject;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Requests implements Serializable {
    private int requestId;
    private String senderId;      // Employee ID of the requester
    private String type;          // e.g., "Backup"
    private String priority;      // e.g., "High"
    private String status;        // e.g., "Pending"
    private String description;
    private LocalDateTime timestamp;

    public int getRequestId() {
        return requestId;
    }

    @Override
    public String toString() {
        return "Requests{" +
                "requestId=" + requestId +
                ", senderId='" + senderId + '\'' +
                ", type='" + type + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Requests(int requestId, String senderId, String type, String priority, String status, String description, LocalDateTime timestamp) {
        this.requestId = requestId;
        this.senderId = senderId;
        this.type = type;
        this.priority = priority;
        this.status = status;
        this.description = description;
        this.timestamp = timestamp;
    }
}
