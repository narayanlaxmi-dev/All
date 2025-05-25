package com.ipl.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	Boolean existsByName(String name);
	
	// select * from Player p where p.name = ?;
	Optional<Player> findByName(String name);
}
