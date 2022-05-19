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
}
