package com.example.onetomanyPL.controller;

import com.example.onetomanyPL.repository.SystemRepository;

public class SystemController {
    private final SystemRepository systemRepository;
    public SystemController(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }
}
