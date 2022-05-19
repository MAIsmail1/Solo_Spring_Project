package com.example.onetomanyPL.controller;

import com.example.onetomanyPL.model.Team;
import com.example.onetomanyPL.repository.TeamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    private final TeamRepository teamRepository;
    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }



}
