package com.ipl.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.ipl.dao.PlayerRepository;
import com.ipl.dao.TeamRepository;
import com.ipl.dto.PlayerDto;
import com.ipl.entity.Player;
import com.ipl.entity.Team;
import com.ipl.exception.ResourceAlreadyExistException;
import com.ipl.exception.ResourceNotFoundException;

@Service
public class PlayerService implements IPlayerService{
	
	@Autowired
	private PlayerRepository playerRepo;
	
	@Autowired
	private TeamRepository teamRepo;

	@Override
	public Boolean addPlayer(PlayerDto playerDto) {
		// 1.Check the player by name 
		Boolean isExist = playerRepo.existsByName(playerDto.getName());
		if(isExist) {
			throw new ResourceAlreadyExistException("Player already available with same name.");
		}
		
		// 2.Get the existing team from db
		Team existingTeam = teamRepo.findByName(playerDto.getTeamName());
		if(!ObjectUtils.isEmpty(existingTeam)) {
			// 3.link the existing team with player
			Player newPlayer = new Player();
			newPlayer.setName(playerDto.getName());
			newPlayer.setCity(playerDto.getCity());
			newPlayer.setSpecialization(playerDto.getSpecialization());
			newPlayer.setTeam(existingTeam);
			
			// 4.Save the player
			Player savedPlayer = playerRepo.save(newPlayer);
			if(!ObjectUtils.isEmpty(savedPlayer)) {
				return true;
			}else {
				return false;
			}
		}else {
			throw new ResourceNotFoundException("Team not found!!");
		}
	}

	@Override
	public Collection<Player> allPlayers() {
		return playerRepo.findAll();
	}

	@Override
	public Player getPlayerByName(String name) {
		return playerRepo.findByName(name)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found of name: "+name));
	}

}
