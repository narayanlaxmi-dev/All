package com.ipl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100)
	private String name;
	
	@Column(length = 50)
	private String city;
	
	@Enumerated(EnumType.STRING)
	private Specialization specialization;
	
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	public Player() {
		
	}

	public Player(Integer id, String name, String city, Specialization specialization, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.specialization = specialization;
		this.team = team;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", city=" + city + ", specialization=" + specialization
				+ ", team=" + team + "]";
	}

}
