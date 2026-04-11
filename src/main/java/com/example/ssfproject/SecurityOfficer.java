package com.example.ssfproject.model;

public class SecurityOfficer {
    private String officerId;
    private String name;
    private String rank;

    public SecurityOfficer(String officerId, String name, String rank) {
        this.officerId = officerId;
        this.name = name;
        this.rank = rank;
    }

    public String getOfficerId() {
        return officerId;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "SecurityOfficer{" +
                "officerId='" + officerId + '\'' +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}

