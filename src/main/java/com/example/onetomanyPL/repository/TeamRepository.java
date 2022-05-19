package com.example.onetomanyPL.repository;

import com.example.onetomanyPL.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    @Query(value = "SELECT * FROM team WHERE founded > 1900", nativeQuery = true)
    List<Team> findTeamFoundedAfter1900();
    @Query(value = "SELECT * FROM team WHERE id > 17", nativeQuery = true)
    List<Team> findTeamThatHaveBeenRelegated();
}

