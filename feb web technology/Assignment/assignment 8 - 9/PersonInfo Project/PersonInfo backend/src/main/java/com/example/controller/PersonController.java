package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.entity.Person;
import com.example.service.IPersonInfo;
@CrossOrigin("*")
@RestController
@RequestMapping("/persons")
public class PersonController {
	
	@Autowired
	private IPersonInfo personService;
	
	@PostMapping("/add")
	public void addPerson(@RequestBody Person newPerson)
	{
		personService.addPerson(newPerson);
		
	}
	@GetMapping("/all")
	public Collection<Person> getAllPerson(){
		Collection<Person> persons = personService.allPerson();
		return persons;
	}
	
}
