package com.example.ssfproject.model;

public class QuickResponseTeam {
    private String teamId;
    private String leaderName;
    private String currentStatus;

    public QuickResponseTeam(String teamId, String leaderName, String currentStatus) {
        this.teamId = teamId;
        this.leaderName = leaderName;
        this.currentStatus = currentStatus;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "QuickResponseTeam{" +
                "teamId='" + teamId + '\'' +
                ", leaderName='" + leaderName + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                '}';
    }
}