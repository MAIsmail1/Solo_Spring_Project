package com.example.onetomanyPL.repository;

import com.example.onetomanyPL.model.Team;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TeamRepositoryTest {

    @Autowired
    TeamRepository teamRepository;
    @Test
    public void findTeamFoundedAfter1900() {
        List<Team> found = teamRepository.findTeamFoundedAfter1900();
        assertThat(found.size()).isEqualTo(5);


    }

    @Test
    void findTeamThatHaveBeenRelegated() {
    }
}