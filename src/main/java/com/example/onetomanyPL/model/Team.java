package com.example.onetomanyPL.model;

public class Team {
    private String name;
    private int founded;
    private String ground;
    private String position;

    public Team() {
    }

    public Team(String name, int founded, String ground, String position) {
        this.name = name;
        this.founded = founded;
        this.ground = ground;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
