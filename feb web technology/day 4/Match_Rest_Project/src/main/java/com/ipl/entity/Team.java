package com.ipl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100)
	private String name;
	
	@Column(length = 200)
	private String owner;
	
	@Column(length = 100)
	private String coach;

	public Team() {
		
	}

	public Team(Integer id, String name, String owner, String coach) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.coach = coach;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", owner=" + owner + ", coach=" + coach + "]";
	}
	
	

}
