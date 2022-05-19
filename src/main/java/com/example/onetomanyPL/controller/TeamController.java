package com.example.onetomanyPL.controller;

import com.example.onetomanyPL.model.Team;
import com.example.onetomanyPL.repository.TeamRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeamController{
    private final TeamRepository teamRepository;
    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/team")
    public List<Team> findAll(){
        return teamRepository.findAll();
    }

    @PostMapping("/team")
    public Team post(@RequestBody Team team){
        return teamRepository.save(team);
    }

    @GetMapping
    public ResponseEntity<Team> getTeamById(Long id){
        Optional<Team> team = teamRepository.findById(id);
                return getTeamById(id);
    }
    @DeleteMapping("/team")
    public void deleteTeamById(@PathVariable Long id){
        teamRepository.deleteById(id);
    }





}
