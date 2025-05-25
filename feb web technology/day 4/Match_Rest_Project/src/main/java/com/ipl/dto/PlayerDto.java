package com.ipl.dto;

import com.ipl.entity.Specialization;

public class PlayerDto {
	
	private String name;
	
	private String city;
	
	private Specialization specialization;
	
	private String teamName;
	
	public PlayerDto() {
		
	}

	public PlayerDto(String name, String city, Specialization specialization, String teamName) {
		super();
		this.name = name;
		this.city = city;
		this.specialization = specialization;
		this.teamName = teamName;
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

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "PlayerDto [name=" + name + ", city=" + city + ", specialization=" + specialization + ", teamName="
				+ teamName + "]";
	}

}
