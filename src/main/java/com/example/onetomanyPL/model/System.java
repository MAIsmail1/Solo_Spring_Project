package com.example.onetomanyPL.model;

public class System {
    private String name;
    private String country;
    private String confederation;
    private int teams;

    public System() {
    }

    public System(String name, String country, String confederation, int teams) {
        this.name = name;
        this.country = country;
        this.confederation = confederation;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getConfederation() {
        return confederation;
    }

    public void setConfederation(String confederation) {
        this.confederation = confederation;
    }

    public int getTeams() {
        return teams;
    }

    public void setTeams(int teams) {
        this.teams = teams;
    }
}
