package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Person;

public interface PersonRepositoy extends JpaRepository<Person, Integer>{
	
}
