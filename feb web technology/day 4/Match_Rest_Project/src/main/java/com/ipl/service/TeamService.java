package com.ipl.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.ipl.dao.TeamRepository;
import com.ipl.entity.Team;
import com.ipl.exception.ResourceAlreadyExistException;
import com.ipl.exception.ResourceNotFoundException;

@Service
public class TeamService implements ITeamService{
	
	@Autowired
	private TeamRepository teamRepo;

	@Override
	public boolean createTeam(Team newTeam) {
		//1. Check weather team available with same name 
		Team existingTeam = teamRepo.findByName(newTeam.getName());
		if(!ObjectUtils.isEmpty(existingTeam)) {
			throw new ResourceAlreadyExistException("Team already avaiable with same name.");
		}
		
		//2. If not available with same name save team
		Team savedTeam = teamRepo.save(newTeam);
		if(!ObjectUtils.isEmpty(savedTeam)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Collection<Team> allTeams() {
		return teamRepo.findAll();
	}

	@Override
	public Team getTeamById(Integer id) {
		return teamRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Team not found of id: "+id));		
	}

	@Override
	public Team getTeamByName(String name) {
		Team foundTeam = teamRepo.findByName(name);
		if(ObjectUtils.isEmpty(foundTeam)) {
			throw new ResourceNotFoundException("Team not found of name: "+name);
		}else {
			return foundTeam;
		}	
	}

}
