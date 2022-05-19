package com.example.onetomanyPL.repository;

import com.example.onetomanyPL.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
