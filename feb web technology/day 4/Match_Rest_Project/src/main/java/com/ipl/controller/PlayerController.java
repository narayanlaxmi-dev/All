package com.ipl.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.dto.PlayerDto;
import com.ipl.entity.Player;
import com.ipl.service.IPlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	private IPlayerService playerService;
	
	//http://localhost:9000/player/add  --- POST
	@PostMapping("/add")
	public ResponseEntity<?> addPlayer(@RequestBody PlayerDto playerDto){
		try {
			Boolean isAdded = playerService.addPlayer(playerDto);
			if(isAdded) {
				return new ResponseEntity<>("Player saved successfully!!",HttpStatus.CREATED);
			}else {
				return new ResponseEntity<>("Failed to add player!!",HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//http://localhost:9000/player/all  --- GET
	@GetMapping("/all")
	public ResponseEntity<?> getAllPlayers(){
		Collection<Player> players = playerService.allPlayers();
		if(CollectionUtils.isEmpty(players)) {
			return new ResponseEntity<>("No players avaialble",HttpStatus.NO_CONTENT);
		}else {
//			return new ResponseEntity<>(players,HttpStatus.OK);
			return ResponseEntity.ok(players);
		}
	}
	
	//http://localhost:9000/player/name/{name}  --- GET
	@GetMapping("/name/{name}")
	public ResponseEntity<?> getPlayerByName(@PathVariable String name){
		try {
			return ResponseEntity.ok(playerService.getPlayerByName(name));
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
