package com.example.onetomanyPL.controller;

import com.example.onetomanyPL.repository.TeamRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    private final TeamRepository teamRepository;
    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

}
