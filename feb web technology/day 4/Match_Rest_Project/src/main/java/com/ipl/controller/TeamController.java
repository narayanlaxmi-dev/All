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

import com.ipl.entity.Team;
import com.ipl.service.ITeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private ITeamService teamService;
	
	//http://localhost:9000/team/add  --- POST
	@PostMapping("/add")
	public ResponseEntity<?> createNewTeam(@RequestBody Team newTeam) {
		try {
			Boolean isCreated = teamService.createTeam(newTeam);
			if(isCreated) {
//				System.out.println("Team added successfully!!");
				return new ResponseEntity<>("Team added successfully!!", HttpStatus.CREATED);
			}else {
//				System.out.println("Failed to add ");
				return new ResponseEntity<>("Failed to add team", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
//			System.err.println(e.getMessage());
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//http://localhost:9000/team/all  --- GET
	@GetMapping("/all")
	public ResponseEntity<?> getAllTeams(){
		Collection<Team> teams = teamService.allTeams();
		if(CollectionUtils.isEmpty(teams)) {
			return new ResponseEntity<>("Teams not available!!", HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(teams, HttpStatus.OK);
		}
	}
	
	//http://localhost:9000/team/{id}  --- GET
	@GetMapping("/{id}")
	public ResponseEntity<?> getTeamById(@PathVariable Integer id){
		try {
			Team foundTeam = teamService.getTeamById(id);
			return new ResponseEntity<>(foundTeam, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//http://localhost:9000/team/name/{name}  --- GET
		@GetMapping("/name/{name}")
		public ResponseEntity<?> getTeamByName(@PathVariable String name){
			try {
				Team foundTeam = teamService.getTeamByName(name);
				return new ResponseEntity<>(foundTeam, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
