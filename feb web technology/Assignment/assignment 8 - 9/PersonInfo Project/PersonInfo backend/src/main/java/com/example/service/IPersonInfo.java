package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PersonRepositoy;
import com.example.entity.Person;

@Service
public class IPersonInfo {
	
	@Autowired
	private PersonRepositoy personRepo;
	
	public void addPerson(Person addPerson)
	{
		personRepo.save(addPerson);
	
	}
	
	public List<Person> allPerson(){
		return personRepo.findAll();
	}
	

}
