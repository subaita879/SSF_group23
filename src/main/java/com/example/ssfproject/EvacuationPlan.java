package com.example.ssfproject.model;

public class EvacuationPlan {
    private String planId;
    private String routeDetails;
    private String assemblyPoint;
    private boolean isActive;

    public EvacuationPlan(String planId, String routeDetails, String assemblyPoint, boolean isActive) {
        this.planId = planId;
        this.routeDetails = routeDetails;
        this.assemblyPoint = assemblyPoint;
        this.isActive = isActive;
    }

    public String getPlanId() {
        return planId;
    }

    public String getRouteDetails() {
        return routeDetails;
    }

    public String getAssemblyPoint() {
        return assemblyPoint;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public void setRouteDetails(String routeDetails) {
        this.routeDetails = routeDetails;
    }

    public void setAssemblyPoint(String assemblyPoint) {
        this.assemblyPoint = assemblyPoint;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "EvacuationPlan{" +
                "planId='" + planId + '\'' +
                ", routeDetails='" + routeDetails + '\'' +
                ", assemblyPoint='" + assemblyPoint + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
