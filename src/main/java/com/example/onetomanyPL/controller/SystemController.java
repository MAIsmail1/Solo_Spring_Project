package com.example.onetomanyPL.controller;

import com.example.onetomanyPL.model.System;
import com.example.onetomanyPL.model.Team;
import com.example.onetomanyPL.repository.SystemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SystemController {
    private final SystemRepository systemRepository;
    public SystemController(SystemRepository systemRepository) {

        this.systemRepository = systemRepository;
    }
    @GetMapping("/system")
    public System findAll(){
        return (System) systemRepository.findAll();
    }

    @PostMapping("/system")
    public System post(@RequestBody System system){
        return (System) systemRepository.save(system);
    }

    @GetMapping
    public ResponseEntity<System> getSystemById(Long id){
        Optional<System> system = systemRepository.findById(id);
        return getSystemById(id);
    }
    @DeleteMapping("/system")
    public void deleteSystemById(@PathVariable Long id){
        systemRepository.deleteById(id);
    }
}
