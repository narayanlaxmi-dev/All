package com.ipl.service;

import java.util.Collection;

import com.ipl.entity.Team;

public interface ITeamService {

	// Create new Team
	boolean createTeam(Team newTeam);
	
	// Get All teams
	Collection<Team> allTeams();
	
	// Get team by id
	Team getTeamById(Integer id);
	
	// Get team by name
	Team getTeamByName(String name);
}
