package com.ipl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{

	Team findByName(String name);
}
