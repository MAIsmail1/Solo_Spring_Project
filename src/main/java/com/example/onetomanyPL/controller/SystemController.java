package com.example.onetomanyPL.controller;

import com.example.onetomanyPL.repository.SystemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {
    private final SystemRepository systemRepository;
    public SystemController(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }
}
