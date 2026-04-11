package com.example.ssfproject.model;

public class DutyTask {
    private String taskId;
    private String taskDescription;
    private String assignedTo;
    private String status;

    public DutyTask(String taskId, String taskDescription, String assignedTo, String status) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.assignedTo = assignedTo;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getStatus() {
        return status;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DutyTask{" +
                "taskId='" + taskId + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

