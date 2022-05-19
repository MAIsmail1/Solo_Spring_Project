package com.example.onetomanyPL.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class System {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private String confederation;
    private int teams;
    @OneToMany(mappedBy = "system", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Team> team;



    public System(String name, String country, String confederation, int teams) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.confederation = confederation;
        this.teams = teams;
    }
    public System() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
