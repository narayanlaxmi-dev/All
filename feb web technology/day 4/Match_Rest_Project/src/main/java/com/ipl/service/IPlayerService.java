package com.ipl.service;

import java.util.Collection;

import com.ipl.dto.PlayerDto;
import com.ipl.entity.Player;

public interface IPlayerService {

	// add new player
	Boolean addPlayer(PlayerDto playerDto);
	
	// Get all players
	Collection<Player> allPlayers();
	
	// Get player by name
	Player getPlayerByName(String name);
}
